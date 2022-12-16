package com.que1;

public class Bank 
{
	private int bal;
	private int accnum;
	private String cname;
	private double roi;
	public Bank(int accnum, String cname, int bal, double roi)
	{
		this.accnum=accnum;
		this.cname=cname;
		this.bal=bal;
		this.roi=roi;
		
	}
	public int Deposit(int amt)
	{
		bal+=amt;
		return bal;
	}
	public int Withdraw(int amt)
	{
		if(bal>5000){
			bal-=amt;
		}
		else{
		System.out.println("Balance is 5000, money can not be withdraw");
		}
		return bal;
	}
	public double getInterest()
	{
		this.roi=roi;
		double interest;
		interest=(bal*roi)/100;
		bal=(int) (bal+interest);
		return roi;
	}
	public void display()
	{
		System.out.println("CUSTOMER NAME= "+cname +"\n"+ "ACCOUNT NUMBER= "+accnum +"\n"+ "ACCOUNT BALANCE= "+bal +"\n"+ "RATE OF INTERSET= "+roi);
	}

}
