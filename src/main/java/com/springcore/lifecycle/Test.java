package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");//bcz destroy we used abstract
		 System.out.println("-----------Life Cycle Using XML-------");
		 Samosa s=(Samosa)context.getBean("sam");
		 System.out.println(s);
		 context.registerShutdownHook();
		 
		 
		 System.out.println("------------Life cycle using Interface-------------");
		 LifeCycleWithInterface l=(LifeCycleWithInterface)context.getBean("lif");
		 System.out.println(l);
		 
		 System.out.println("------------Life cycle using Annotations-------------");
		 LifeCycleWithAnnotations A=(LifeCycleWithAnnotations) context.getBean("anno");
		 System.out.println(A);

	}

}
