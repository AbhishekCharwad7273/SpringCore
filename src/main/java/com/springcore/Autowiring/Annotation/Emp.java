package com.springcore.Autowiring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp
{
	@Autowired
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Emp(Address add) {
		super();
		this.add = add;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}

}


	