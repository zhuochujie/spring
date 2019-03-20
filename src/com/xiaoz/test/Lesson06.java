package com.xiaoz.test;

import com.xiaoz.model.Customer;
import com.xiaoz.model.Programmer;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson06 {

    @Test
    public void test() throws Exception {
        /*
        bean的集合注入
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans06.xml");

        Programmer programmer = (Programmer) context.getBean("programmer");

        System.out.println("车："+programmer.getCars());
        System.out.println("宠物："+programmer.getPats());
        System.out.println("信息："+ programmer.getInfos());
        System.out.println("数据库链接信息："+ programmer.getMysqlInfos());
        System.out.print("家庭成员：");
        for (String member: programmer.getMembers()){
            System.out.print(member+",");
        }
    }
}
