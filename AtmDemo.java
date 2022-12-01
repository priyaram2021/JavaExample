import java.util.*;
import java.util.Scanner;
class AtmDemo
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your name:");
		String a = input.nextLine();
		System.out.println("Enter your Password:");
		int b = input.nextInt();
		System.out.println("Enter your option: \n1.Withdraw \n2.Deposit \n3.Balance \n4.Exit");
		int option = input.nextInt();
		atm(option);
	}
	public static void atm(int option)
	{
		int balance = 35000;
		Scanner input = new Scanner (System.in);
		switch(option)
		{
		case 1 : 
			System.out.println("Enter your amount");
			int amount = input.nextInt();
			if(amount < balance)
			{
			    System.out.println("Receive your amount");
				balance = amount - balance;
			}
			break;	
		case 2:
			System.out.println("Enter your deposit amount");
			int deposit = input.nextInt();
			balance = deposit + balance;
			//System.out.println(balance);
			break;
		case 3:
			System.out.println(balance);
			break;
		case 4:
			System.out.	println("Thankyou ,visit again");
			break;
		}
	}
}