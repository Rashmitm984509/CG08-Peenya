package com.tnsif.streamAPIprogram;

import java.util.stream.Stream;

// demo for skip method
public class SKIPexample {
public static void main(String[] args) {
	Stream.of(1,2,3,4,5,67,8,96,345,6,55,6,90,78,89,67,46).filter(num->num%2==0).skip(5).forEach(num->System.out.println(num+" "));
}
}
