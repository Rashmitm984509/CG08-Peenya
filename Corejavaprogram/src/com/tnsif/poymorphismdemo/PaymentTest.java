package com.tnsif.poymorphismdemo;
// demo for method overriding
class Payment{
	void makepayment() {
		System.out.println("processing payment using method");
	}
}
//subclass
class UPIPayment extends Payment{
	@Override
	void makepayment() {
		System.out.println("payment using UPI");
	}	
}
class CardPayment extends Payment{
	@Override
	void makepayment() {
		System.out.println("payment using credit card");
	}	
}

public class PaymentTest {
public static void main(String[] args) {
	UPIPayment u=new UPIPayment();
	u.makepayment();
	
	CardPayment v=new CardPayment();
	v.makepayment();
}
}
