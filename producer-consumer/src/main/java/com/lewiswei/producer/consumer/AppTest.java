package com.lewiswei.producer.consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Lewis Wei on 17/3/7.
 */
public class AppTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        ItemQueue itemQueue = new ItemQueue();
        // Producers
        for (int i = 0; i < 2; i++) {
            final Producer producer = new Producer("producer#" + i, itemQueue);
            executorService.submit(() -> {
                while (true) {
                    producer.produce();
                }
            });
        }

        // Consumers
        for (int i = 0; i < 3; i++) {
            final Consumer consumer = new Consumer("consumer#" + i, itemQueue);
            executorService.submit(() -> {
                while (true) {
                    consumer.comsume();
                }
            });
        }

        executorService.shutdown();

        // 运行10秒后结束
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        executorService.shutdownNow();
    }
}
