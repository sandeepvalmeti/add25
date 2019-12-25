package org.constructor;

public class B extends A {
	public B() {
		super();
		System.out.println("default ");
	}
	
	public static void main(String[] args) {
		B obj1=new B();
	}
	

}
