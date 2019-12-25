package org.constructor;

public class A {
	public A() {
		this ("sandeep");
	     System.out.println("Default const...");
	  }
public A(int id) {
		  this (123.23f);
	    System.out.println(id);
	  }
	  public A(String name) {
		  this (123);
 System.out.println(name);
	  }
	public A(float sal) {
	    System.out.println(sal);
	  }
 public static void main(String[] args) {
	    A a = new A();
	    
	    System.out.println("Vyshnavi 1");
	    
	    System.out.println("Vyshnavi 2");
	    System.out.println("Vyshnavi 3");
	    System.out.println("Vyshnavi 2");
	    System.out.println("Vyshnavi 34");
	    
	  }

	}


