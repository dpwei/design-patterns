package com.lewiswei.nullobject;

public class Company {

    private Customer customer;

    public Customer getCustomer() {
        return customer != null ? customer : new NullCustomer();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
