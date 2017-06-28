package com.test.exceptions;

import java.io.*;
public class InsufficientFundsException extends Exception//RuntimeException //if we keep exception we can't compile the program it shows checked exception 
{															//if we keep RunTimeException then we can compile the program we will get Exception at runtime
	 private double amount;
	 public InsufficientFundsException(double amount)
	 {
		 this.amount = amount;
	 }
	 public double getAmount()
	 {
		 return amount;
	 }
}