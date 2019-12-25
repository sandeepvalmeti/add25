package org.constructor;
public class Sandeep {
	// default constructor 
	
	public Sandeep(){
	System.out.println("default constructor");
	}
	// argument constructor 
	public Sandeep(int empid) {
		System.out.println("argument constructor with id ");
	
	}
	public Sandeep(float salary) {
		System.out.println("argument constructor with float");
	}
	public static void main(String[] args) {
		Sandeep obj=new Sandeep();
		Sandeep obj1=new Sandeep(12345);
		Sandeep obj2=new Sandeep(123.321f);
		
	}
	


}
