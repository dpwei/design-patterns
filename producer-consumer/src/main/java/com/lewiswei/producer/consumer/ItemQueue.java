package com.lewiswei.producer.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ItemQueue {

    private BlockingQueue<Item> queue;

    public ItemQueue() {
        this.queue = new LinkedBlockingDeque<>(5);
    }

    public void enqueue(Item item) throws InterruptedException {
        this.queue.put(item);
    }


    public Item dequeue() throws InterruptedException {
        return this.queue.take();
    }

}
