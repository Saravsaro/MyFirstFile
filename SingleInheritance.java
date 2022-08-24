package com.test;

class A     //Parent class
{
 private String parentMsg;
 
  public void parentTest()
  {
	  System.out.println("Parent class method..");
  }
	
}


class B extends A
{
	private String childMsg;
	
	public void childTest()
	{
		System.out.println("Child class method..");
	}
}




public class SingleInheritance {

	public static void main(String[] args) {
		B ob=new B();
		
		ob.childTest(); //accessing child property
		
		
		ob.parentTest();  //accessing parent method
		

	}

}
