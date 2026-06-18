package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// demo for comparator (Multiple sorting)

class College{
	String name;
	int rollno;
	String address;
	
	public College(String name, int rollno, String address) {
		
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}
	
	void display() {
		System.out.println("Name "+name+" "+"rollno "+rollno+" "+"address");
	}
}
// sort by name

class Namecomparator implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
//sort by rollno

class RollnoComparator implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		
		return Integer.compare(o1.rollno, o2.rollno);
	}
	
}
//sort by address

class Addresscomparator implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		
		return o1.address.compareTo(o2.address);
	}
	
}

public class Comparatordemo {
public static void main(String[] args) {
	List<College> pl=new ArrayList<>();
	pl.add(new College("Rahul",1,"Bangalore"));
	pl.add(new College("Sushma",9,"mangalore"));
	pl.add(new College("Kusuma",5,"udupi"));
	pl.add(new College("Guru",3,"Hospet"));
	
	//sort by name
	Collections.sort(pl,new Namecomparator());
	System.out.println("sort by name");
	for(College t:pl) {
		t.display();
	}
	
	//sort by rollno
		Collections.sort(pl,new  RollnoComparator());
		System.out.println("sort by rollno");
		for(College t:pl) {
			t.display();
		}
}
}
