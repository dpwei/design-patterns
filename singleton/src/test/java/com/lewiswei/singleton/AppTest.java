package com.lewiswei.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

/**
 * Created by Lewis Wei on 17/3/4.
 */
public abstract class AppTest<T> {


    private final Supplier<T> singletonInstanceMethod;

    public AppTest(Supplier<T> supplier) {
        this.singletonInstanceMethod = supplier;
    }


    @Test
    public void testMultipleCallInThreadSafe() {
        T instance1 = singletonInstanceMethod.get();
        T instance2 = singletonInstanceMethod.get();
        T instance3 = singletonInstanceMethod.get();

        Assert.assertSame(instance1, instance2);
        Assert.assertSame(instance2, instance3);
        Assert.assertSame(instance3, instance1);
    }


    @Test
    public void testMultipleCallInDifferentThreads() throws Exception {
        final List<Callable<T>> tasks = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            tasks.add(this.singletonInstanceMethod::get);
        }

        final ExecutorService executorService = Executors.newFixedThreadPool(8);
        final List<Future<T>> futures = executorService.invokeAll(tasks);

        T expectedInstance = null;

        for (Future<T> future : futures) {
            T instance = future.get();
            if (expectedInstance == null) {
                expectedInstance = instance;
            }
            Assert.assertSame(expectedInstance, instance);
        }

        executorService.shutdown();

    }
}
