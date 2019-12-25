package org.constructor;

public class B extends A {
	public B() {
		super();
		System.out.println("default ");
	}

	public static void main(String[] args) {
		B obj1 = new B();
		System.out.println("raseem 1");
		System.out.println("raseem 2");
		System.out.println("raseem 3");
	}

}
