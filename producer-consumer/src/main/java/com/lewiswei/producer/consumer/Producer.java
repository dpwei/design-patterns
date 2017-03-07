package com.lewiswei.producer.consumer;

import java.util.Random;

public class Producer {

    private final String name;

    private final ItemQueue itemQueue;

    private long itemId;

    public Producer(String name, ItemQueue itemQueue) {
        this.name = name;
        this.itemQueue = itemQueue;
    }

    public String getName() {
        return name;
    }

    public ItemQueue getItemQueue() {
        return itemQueue;
    }

    public void produce() throws InterruptedException {
        itemId++;
        Item item = new Item(itemId, name);
        itemQueue.enqueue(item);
        Thread.sleep(new Random().nextInt(2000));
    }
}
