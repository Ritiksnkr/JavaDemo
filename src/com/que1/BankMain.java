package com.que1;
public class BankMain {
	public static void main(String[] args)
	{
		Bank bank=new Bank(273892912,"Ritik Sonker",0,5.0);
		bank.Deposit(10000);
		bank.Withdraw(2000);
		bank.getInterest();
		bank.display();
	}

}
