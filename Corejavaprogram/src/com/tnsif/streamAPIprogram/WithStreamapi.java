package com.tnsif.streamAPIprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamapi {
public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List<Integer> result=numbers.stream()  //create a stream from the list
			.filter(n->n%2==0)//I.P:keep only even number (filtering data)
			.map(n->n*2)  //I>P:fetching (doubled the number)
			.sorted()  //I.P:sort the numbers
			.collect(Collectors.toList()); //T p: Collect results
	System.out.println("final doubled numbers "+result);
}
}
