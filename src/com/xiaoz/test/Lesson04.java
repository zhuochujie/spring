package com.xiaoz.test;

import com.xiaoz.model.Student;
import com.xiaoz.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson04 {

    @Test
    public void test() throws Exception {
        //给对象的属性赋值
        /*1.构造方法注入
        2.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");

        Student stu = (Student) context.getBean("stu");

        System.out.println(stu);
    }
}
