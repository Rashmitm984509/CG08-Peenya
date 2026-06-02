package com.tnsif.poymorphismdemo;
// demo for method overloading

class Calculator{
	int add(int a,int b) {
		return a+b;
		
	}
	double add(double c,double d) {
		return c+d;
		
	}
	int add(int a,int b,int h) {
		return a+b+h;
		
	}
}
public class MethodOverloading {
public static void main(String[] args) {
	Calculator c=new Calculator();
	System.out.println(c.add(3.2, 4.5));
	System.out.println(c.add(1, 4));
	System.out.println(c.add(1, 2, 3));
}
}
