package com.iesvirgendelcarmen.ejercicios;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankAccount {

	private static final String ENTITY = "1234";
	private static final String OFFICE = "5678";
	private String accountNumber = ENTITY+OFFICE;
	private double balance=0;
	private double interest=2.5;
	private LocalDate creationDate = LocalDate.now();

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
	public BankAccount() {
	}

	public BankAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}
		
	private String accountNumberGenerator () {
		StringBuilder sBuilder = new StringBuilder();
		for (int i=0; i<10;i++) {
			sBuilder.append((int)(Math.random()*10)+"");
		}

		return sBuilder.toString();
	}
	

	
	private String algorithmFirstDigit() {
		int digit = 11-(((ENTITY.charAt(0)-48)*4)+
				((ENTITY.charAt(1)-48)*8)+
				((ENTITY.charAt(2)-48)*5)+
				((ENTITY.charAt(3)-48)*10)+
				((OFFICE.charAt(0)-48)*9)+
				((OFFICE.charAt(1)-48)*7)+
				((OFFICE.charAt(2)-48)*3)+
				((OFFICE.charAt(3)-48)*6))%11;
		if (digit==10)
			return "1";
		else
			return digit+"";
	}
	
	private String algorithmSecondDigit() {
		int digit = 11-(((accountNumberGenerator().charAt(0)-48)*1)+
				((accountNumberGenerator().charAt(0)-48)*2)+
				((accountNumberGenerator().charAt(0)-48)*4)+
				((accountNumberGenerator().charAt(0)-48)*8)+
				((accountNumberGenerator().charAt(0)-48)*5)+
				((accountNumberGenerator().charAt(0)-48)*10)+
				((accountNumberGenerator().charAt(0)-48)*9)+
				((accountNumberGenerator().charAt(0)-48)*7)+
				((accountNumberGenerator().charAt(0)-48)*3)+
				((accountNumberGenerator().charAt(0)-48)*6))%11;
		if (digit==10)
			return "1";
		else
			return digit+"";
	}
	
	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		System.out.println(bankAccount.accountNumberGenerator());
		System.out.println(bankAccount.algorithmFirstDigit());
		System.out.println(bankAccount.algorithmSecondDigit());
		
	}
	
}