package org.constructor;

public class Sandy1 {
	public Sandy1() {
		this (1234);
		
			System.out.println("default constructor");
			}
			
			public Sandy1(int empid) {
				this (123.23f);
				System.out.println(empid);
			
			}
			public Sandy1(float salary) {
				System.out.println(salary);
			}
			public static void main(String[] args) {
				Sandy1 obj=new Sandy1();
				
	}

}
