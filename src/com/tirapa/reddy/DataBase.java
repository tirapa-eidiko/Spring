package com.tirapa.reddy;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;
import java.sql.*;
import org.aspectj.lang.annotation.Aspect;

public class DataBase {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		BeanFactory beans= new XmlBeanFactory(new FileSystemResource("src/mybeans.xml"));
		
		ApplicationContext ctx1
        = new ClassPathXmlApplicationContext(new String []{"mybeans.xml"});
		

		
		AbstractApplicationContext ctx
        = new ClassPathXmlApplicationContext(new String []{"mybeans.xml"});

    // add a shutdown hook for the above context... 
        ctx.registerShutdownHook();
        ctx.refresh();
		
		
//		@SuppressWarnings("unused")
//		Class c=(Class)beans.getBean("class");
//		
//		//Connection con=(Connection)beans.getBean("con");
//		
//		Message m=(Message)beans.getBean("message");
//		
//		System.out.print(m.getMessage());
//		
//		
//		Message m1=(Message)beans.getBean("message1");
//		
//		System.out.println("\n\n\n\n" + m1.getMessage());
		
		
//        Message m2=(Message)ctx.getBean("message");
//		
//		System.out.println("\n\n\n\n" +m2.getMessage());
		
		
//		Message m3=(Message)ctx.getBean("message1");
//		
//		System.out.println("\n\n\n\n" + m3.getMessage());
//		
		
		
		
		

	}

}
