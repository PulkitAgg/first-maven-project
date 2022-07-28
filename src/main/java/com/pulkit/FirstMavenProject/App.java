package com.pulkit.FirstMavenProject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	BeanFactory
//    	ApplicationContext super set of beanFactory
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//        System.out.println( "Hello World!" );
//        Vehicle obj = new Bike();
    	Vehicle obj = (Vehicle)context.getBean("vehicle");
        obj.drive();
    }
    
}
