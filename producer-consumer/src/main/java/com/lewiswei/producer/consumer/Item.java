package com.lewiswei.producer.consumer;

public class Item {

    private Long id;

    private String producer;

    public Item(Long id, String producer) {
        this.id = id;
        this.producer = producer;
    }

    public Long getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append(producer);
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
