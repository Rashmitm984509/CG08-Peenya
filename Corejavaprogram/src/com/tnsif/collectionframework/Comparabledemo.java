package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

// demo for comparable interface (single sorting)

class Person1 implements Comparable<Person1>{
	String name;
	int age;
	
	Person1(String name, int age){
		this.name=name;
		this.age=age;
	}
	void displayinfo() {
		System.out.println("Name: "+name+" "+"Age: "+age);
	}
	@Override   // comparing logic
	public int compareTo(Person1 o) {
		
		//return this.name.compareTo(o.name);  // string
		return Integer.compare(this.age, o.age);  // numarical
	}
}

public class Comparabledemo {
	public static void main(String[] args) {
		ArrayList<Person1> al=new ArrayList<>();
		al.add(new Person1("John",30));
		al.add(new Person1("Anil",38));
		al.add(new Person1("Bhaskar",60));
		al.add(new Person1("Rohith",10));
		
		Collections.sort(al);
		
		for(Person1 h:al) {
			h.displayinfo();
		}
	}

}
