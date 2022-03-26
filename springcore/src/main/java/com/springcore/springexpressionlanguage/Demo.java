package com.springcore.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	//primitive type general spring expression language syntax.
	@Value("#{22+11}")
	private int x;

	//using static methods/variables using spring expression language.
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int y;

	//creating objects using spring expression language.
	@Value("#{new String('Rohan')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", name=" + name + ", isActive=" + isActive + "]";
	}

	
	
	

}
