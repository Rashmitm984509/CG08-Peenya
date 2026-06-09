package com.tnsif.interfacedemo;
// demo for functional interface

@FunctionalInterface
interface Notification{
	void notifyUser(String message);
}

//Email notification class
class Emailnotification implements Notification{

	@Override
	public void notifyUser(String message) {
		System.out.println("sending email "+message);
	}
	
}

//sms notification user

class SMSNotification implements Notification{

	@Override
	public void notifyUser(String message) {
		System.out.println("sending sms "+message);
		
	}
	
}
public class Functionalinterface {
public static void main(String[] args) {
	Notification n=new Emailnotification();
	
	Notification s=new SMSNotification();
	
	n.notifyUser("assigment upload");
	s.notifyUser("class at 10am");
}
}
