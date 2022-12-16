package com.que4;
import java.util.Scanner;

class UnsupportedTransactionException extends Exception
{
	public UnsupportedTransactionException(String str)
	{
		super(str);
	}
}

public class ATMTransaction 
{
	public void execute(String transactionType)throws UnsupportedTransactionException
	{
		switch(transactionType.toLowerCase())
		{
			case "credit":
				System.out.println("Credit");
				break;
			case "debit":
				System.out.println("Debit");
				break;
			case "balanceinquiry":
				System.out.println("Balance Enquiry");
				break;
			case "pinchange":
				System.out.println("Pin Change");
				break;
			default:
				throw new UnsupportedTransactionException("Unsupported Transaction Type");
		}
	}
}
class AtmTransactionMain
{
	public static void main(String[] args)
	{
		ATMTransaction atm=new ATMTransaction ();
		System.out.println("Enter Transaction Type");
		Scanner sc =new Scanner(System.in);
		try 
		{
			atm.execute(sc.nextLine());
		}
		catch(UnsupportedTransactionException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
