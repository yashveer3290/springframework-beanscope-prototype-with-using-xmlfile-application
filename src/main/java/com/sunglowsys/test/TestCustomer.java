package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getMobile());
        System.out.println(customer.hashCode());
        Customer customer1 = (Customer) context.getBean("customer");
        System.out.println(customer1.hashCode());
        Address address = context.getBean(Address.class);
        System.out.println(address.getAddressLine1());
        System.out.println(address.getAddressLine2());


    }
}
