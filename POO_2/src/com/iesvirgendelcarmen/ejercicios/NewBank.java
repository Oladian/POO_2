package com.iesvirgendelcarmen.ejercicios;

import java.util.List;

public class NewBank {
	 public static void main(String[] args) {
		BankAccount bA1 = new BankAccount();
		Bank b1 = new Bank("Santandar");
		b1.addAccount(bA1);
		System.out.println(b1);
		
		suscribeAccount(100, b1);
		System.out.println(b1);
		System.out.println("Coincidencias "+b1.getCoincidencias());
	}
	 
	 public static void suscribeAccount(int numberOfAccounts, Bank bank) {
		 
		 for (int i=0; i<numberOfAccounts;i++) {
				bank.addAccount(new BankAccount((int)(Math.random()*10),3));
			}
	 }
	
}
