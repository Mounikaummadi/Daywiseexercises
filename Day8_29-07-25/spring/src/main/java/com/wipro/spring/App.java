package com.wipro.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.spring.beans.Department;
import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
         Department dept = (Department) context.getBean("department");
         dept.setDeptCode("Fin");
         dept.setDeptName("Finance");
         System.out.println(dept);

    }
}
