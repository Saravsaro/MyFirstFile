package com.test;

public class Static {
	public static void main(String[] args) {
		test();
		Static ob=new Static();
		ob.nonStaticMethod();
		System.out.println("this ");
	}


	static void test() {
		System.out.println("this is a static method");
	}
	void nonStaticMethod() {
		System.out.println("this is non static method");
	}
	
}
