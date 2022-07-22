package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleWithAnnotations
{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public LifeCycleWithAnnotations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LifeCycleWithAnnotations [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start()
	{
		 System.out.println("starting method");
	}
	
	@PreDestroy
	public void end()
	{
		 System.out.println("end method");
	}
}
