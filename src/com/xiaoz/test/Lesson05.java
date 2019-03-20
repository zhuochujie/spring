package com.xiaoz.test;

import com.xiaoz.model.Customer;
import com.xiaoz.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson05 {

    @Test
    public void test() throws Exception {
        /*
        2.SpEL:spring表达式
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans05.xml");

        Customer customer = (Customer) context.getBean("customer");

        System.out.println(customer);
        System.out.println(customer.getAddress());
    }
}
