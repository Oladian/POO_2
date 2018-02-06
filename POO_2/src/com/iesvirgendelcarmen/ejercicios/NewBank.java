package com.iesvirgendelcarmen.ejercicios;

import java.util.List;

public class NewBank {
	 public static void main(String[] args) {
		BankAccount bA1 = new BankAccount();
		Bank b1 = new Bank("AA");
		
		b1.addAccount(bA1);
		System.out.println(b1);
		
	}
	
}
