package com.lewiswei.producer.consumer;

public class Consumer {

    private final String name;
    private final ItemQueue itemQueue;

    public Consumer(String name, ItemQueue itemQueue) {
        this.name = name;
        this.itemQueue = itemQueue;
    }


    public String getName() {
        return name;
    }

    public ItemQueue getItemQueue() {
        return itemQueue;
    }

    public void comsume() throws InterruptedException {
        Item item = this.itemQueue.dequeue();
        System.out.println(name + item.toString());
    }
}
