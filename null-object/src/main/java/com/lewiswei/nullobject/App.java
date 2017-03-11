package com.lewiswei.nullobject;

public class App {
    public static void main(String[] args) {
        Company company = new Company();
//        Customer customer = company.getCustomer();
//        if (customer == null) {
//            customer.setName("N/A");
//        }
//        System.out.println(customer.getName());

        /**
         * Null Object pattern
         */
        Customer customer = company.getCustomer();
        System.out.println(customer.getName());
    }
}
