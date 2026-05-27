package com.tnsif.accessmodifierprogram;
// demo for public access modifier
// private (with in class)

public class Publicdemo {
	public int a=9;  // data member 
	private String b="kusuma";
	
	char w='i';
	
	protected int s=7;
	
	public void display() {// function or method or member function
		System.out.println("welcome");
	}
	
	public static void main(String[] args) {
		Publicdemo p=new Publicdemo();
		
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.s);
		System.out.println(p.w);
		
	}

}
