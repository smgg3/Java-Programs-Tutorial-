package com.test.exceptions;

//File Name CheckingAccount.java
import java.io.*;
public class CheckingAccount
{
		private double balance;
		private int number;
		
		public CheckingAccount(int number)
		{
			this.number = number;
		}
		
		public void deposit(double amount)
		{
			balance += amount;
		}
		
		public void withdraw(double amount) throws InsufficientFundsException
		{
			if(amount <= balance)
			{
			balance -= amount;
			}
			else
			{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
			}
		}
		
		public double getBalance()
		{
		return balance;
		}
//		public static void main(String[] args){
//			CheckingAccount o=new CheckingAccount(1);
//			o.deposit(20);
//			//o.withdraw(10);
//			//o.withdraw(30);//
//			
//			
//		}
}
