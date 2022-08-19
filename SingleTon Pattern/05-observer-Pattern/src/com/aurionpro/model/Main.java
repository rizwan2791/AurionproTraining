package com.aurionpro.model;

public class Main {
	
	public static void main(String[] args) {
		Account acc = new Account(101, "Rizwan", 10000);
		acc.registerNotifier(new EmailNotifier());
		acc.registerNotifier(new SMSNotifier());
		acc.Deposite(5000);
		System.out.println("-----------------------");
		acc.withdraw(500);
	}

}