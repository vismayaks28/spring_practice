package org.example;

import com.spring.BeanDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
            // spring container its is also known as IOC container
            //is response to create object and inject it.
            //in sprint there ate three type of container
            //beanfactory super container
            // apllicationContext child container of beanfactory
            //webapplicationcontext child container of applicationcontext
            ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
    // it will create bean object for beandemo.class
            BeanDemo bean =  container.getBean(BeanDemo.class);
            // this time the spring will create the object and initialize the value
            System.out.println(bean.getId()+" "+bean.getName());
            bean.add(4,5);



    }
}
