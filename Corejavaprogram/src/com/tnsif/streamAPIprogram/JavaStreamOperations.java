package com.tnsif.streamAPIprogram;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class JavaStreamOperations {
public static void main(String[] args) {
	List<Product> Pl=new ArrayList<Product>();
	
	Pl.add(new Product(1,"HP",25000f));
	Pl.add(new Product(2,"lenova",30000f));
	Pl.add(new Product(1,"DEll",250000f));
	Pl.add(new Product(1,"Apple",2500009f));
	
//	List<Float> pl2=Pl.stream().filter(p->p.price>30000)//filtering data
//			.map(p->p.price) //fitching price
//			.collect(Collectors.toList()); //collecting as list
//	System.out.println(pl2);
//	
	
	//sum by using collectors method
	
//	DoubleSummaryStatistics totalprice =Pl.stream().collect(Collectors.summarizingDouble(product->product.price));
//	System.out.println(totalprice);
//	
	//count()
	
	long count=Pl.stream().filter(product->product.price<300000).count();
	System.out.println("final count" +count);
}


}
