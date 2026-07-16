package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args){

        // constructor

//    DBConnection db1 = DBConnection.getDBConnection();
//    DBConnection db2 = DBConnection.getDBConnection();
//   //only one object created
//    System.out.println(db1);
//    System.out.println(db2);


// using setter and getter method
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        DBConnection db1 = context.getBean(DBConnection.class);
        DBConnection db2 = context.getBean(DBConnection.class);
        System.out.println(db1);
        System.out.println(db2);



    }
}
