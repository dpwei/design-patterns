package com.lewiswei.nullobject;

public final class NullCustomer extends Customer {

    @Override
    public String getName() {
        return "N/A";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
