package com.iesvirgendelcarmen.ejercicios;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.print.attribute.standard.OutputDeviceAssigned;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class BankAccount {
	
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount(1000.60,2.5);
		
		acc1.depositMoney(100);
		acc1.withdrawMoney(3);
		System.out.println(acc1);
		System.out.println(acc2);
		
		System.out.println(accountsAmount);
		
	}
		
	private static final int[] VALUES= {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
	private static final String ENTITY = "1234";
	private static final String OFFICE = "5678";

	private double balance=0;
	private double interest=2.5;
	private LocalDate creationDate = LocalDate.now();
	public static int accountsAmount = 0;

	private String accountNumberGenerator () {
		StringBuilder sBuilder = new StringBuilder();
		for (int i=0; i<10;i++) {
			sBuilder.append((int)(Math.random()*10)+"");
		}

		return sBuilder.toString();

	}
	
	private String outPut = accountNumberGenerator();
	
	private String algorithmFirstDigit() {
		
		int digit = 0;
		/*int digit = (((ENTITY.charAt(0)-48)*4)+
				((ENTITY.charAt(1)-48)*8)+
				((ENTITY.charAt(2)-48)*5)+
				((ENTITY.charAt(3)-48)*10)+
				((OFFICE.charAt(0)-48)*9)+
				((OFFICE.charAt(1)-48)*7)+
				((OFFICE.charAt(2)-48)*3)+
				((OFFICE.charAt(3)-48)*6));*/
		
		for (int i = 0; i < 4; i++) {
			digit +=(ENTITY.charAt(i)-48)*VALUES[i+2];
			digit +=(OFFICE.charAt(i)-48)*VALUES[i+6];
		}
		
		digit=11-digit%11;
		
		if (digit==11)
			return "0";
		else if (digit == 10)
			return "1";
		else
			return digit+"";
	}
	
	// https://www.lawebdelprogramador.com/codigo/Visual-Basic/327-Calculo-del-digito-de-control-de-cuenta-bancaria.html
	// view-source:http://www.luciano.es/utiles/ccc.htm
	
	private String algorithmSecondDigit() {
		int digit=0;
		// private static final int[] VALUES= {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
		for (int i = 0; i < 10; i++) {
			digit +=((outPut.charAt(i)-48)*VALUES[i]);
		}

		/*int digito = (((accountNumberGenerator().charAt(0)-48)*1)+
				((accountNumberGenerator().charAt(0)-48)*2)+
				((accountNumberGenerator().charAt(0)-48)*4)+
				((accountNumberGenerator().charAt(0)-48)*8)+
				((accountNumberGenerator().charAt(0)-48)*5)+
				((accountNumberGenerator().charAt(0)-48)*10)+
				((accountNumberGenerator().charAt(0)-48)*9)+
				((accountNumberGenerator().charAt(0)-48)*7)+
				((accountNumberGenerator().charAt(0)-48)*3)+
				((accountNumberGenerator().charAt(0)-48)*6));*/	
		//digit%=11;
		
		if (digit==11)
			return "0";
		else if (digit == 10)
			return "1";
		else
			return 11-(digit%11)+"";
	}
	
	public void depositMoney (double money) {
		setBalance(money+getBalance());
	}
	
	public void withdrawMoney (double money) {
		setBalance(getBalance()-money);
	}

	private String accountNumber = ENTITY+OFFICE+algorithmFirstDigit()+algorithmSecondDigit()+outPut;
	
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
		accountsAmount++;
	}

	public BankAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
		accountsAmount++;
	}

	@Override
	public String toString() {
		return "BankAccount [Balance= " + balance + ", Account Number= " + accountNumber + "]";
	}

}
