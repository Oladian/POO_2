package com.iesvirgendelcarmen.ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankAccount {
			
	private static final int[] VALUES= {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
	private static final String ENTITY = "1234";
	private static final String OFFICE = "5678";

	private double balance=0;
	private double interest=2.5;
	private LocalDate creationDate = LocalDate.now();
	
	private String accountNumber=null;
	public static int accountsAmount = 0;
	
	public BankAccount() {  // Constructor por defecto
		this.accountNumber=getDigitsOfAccount();
		accountsAmount++;
	}

	public BankAccount(double balance, double interest) { // Constructor
		this.accountNumber=getDigitsOfAccount();
		this.balance = balance;
		this.interest = interest;
		accountsAmount++;
		getCreationDate();
	}
	
	private String accountNumberGenerator () {
		StringBuilder sBuilder = new StringBuilder();
		for (int i=0; i<10;i++) {
			sBuilder.append((int)(Math.random()*10)+"");
		}

		return sBuilder.toString();

	}
	
	//private String outPut = accountNumberGenerator();
	
	private String getDigitsOfAccount() {    // Generar los dígitos de control con inner class
		//String digit;
		String outPut = accountNumberGenerator();
		class FirstDigitControl{
			private int generateDigit() {
				int digitA = 0;
				for (int i = 0; i < 4; i++) {
					digitA +=(ENTITY.charAt(i)-48)*VALUES[i+2];
					digitA +=(OFFICE.charAt(i)-48)*VALUES[i+6];
				}
				return digitA;
			}
		}
		
		FirstDigitControl f1 = new FirstDigitControl();
		int firstDigit = f1.generateDigit();
		
		class SecondDigitControl{
			private int generateDigit() {
				int digitB=0;
				for (int i = 0; i < 10; i++) {
					digitB +=((outPut.charAt(i)-48)*VALUES[i]);
				}
				
				return digitB;
			}
		}
		
		SecondDigitControl s1 = new SecondDigitControl();
		int secondDigit = s1.generateDigit();
		
		firstDigit=11-(firstDigit%11);
		secondDigit=11-(secondDigit%11);
		
		if (firstDigit==11)
			firstDigit = 0;
		else if (firstDigit == 10)
			firstDigit = 1;
				
		if (secondDigit==11)
			secondDigit=0;
		else if (secondDigit == 10)
			secondDigit=1;
		
			return ENTITY+OFFICE+firstDigit+secondDigit+outPut;
		
	}
	/*
	private String algorithmFirstDigit() {
		
		int digit = 0;
		int digit = 
		  		(((ENTITY.charAt(0)-48)*4)+
				((ENTITY.charAt(1)-48)*8)+
				((ENTITY.charAt(2)-48)*5)+
				((ENTITY.charAt(3)-48)*10)+
				((OFFICE.charAt(0)-48)*9)+
				((OFFICE.charAt(1)-48)*7)+
				((OFFICE.charAt(2)-48)*3)+
				((OFFICE.charAt(3)-48)*6));
		
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
				((accountNumberGenerator().charAt(0)-48)*6));
		//digit%=11;
		
		if (digit==11)
			return "0";
		else if (digit == 10)
			return "1";
		else
			return 11-(digit%11)+"";
	}	
*/
	public void depositMoney (double money) { // de instancia, no lleva STATIC
		balance+=money;
	}
	
	public void withdrawMoney (double money) {
		balance-=money;
	}

//	private String accountNumber = ENTITY+OFFICE+algorithmFirstDigit()+algorithmSecondDigit()+outPut; //esta mal
	
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

	@Override
	public String toString() {
		return "BankAccount [Balance= " + balance + ", Account Number= " + accountNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}

	
}
