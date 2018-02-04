package com.iesvirgendelcarmen.ejercicios;
import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	static List<BankAccount> bankAccountList = new ArrayList<>();
	
	public static void main(String[] args) {
	
		Bank bank = new Bank();
		
		bank.suscribeAccounts(4);
		System.out.println(bankAccountList);
		System.out.printf("Maximo: %s%n",bank.maxBalance());
		System.out.printf("Minimo: %s%n",bank.minBalance());
		System.out.printf("Media: %f%n",bank.averageBalance());
		
	}
	
	public void suscribeAccounts(int numberOfAccounts) {
		for (int i=0; i<numberOfAccounts;i++) {
			bankAccountList.add(new BankAccount((int)(Math.random()*10),3));
		}
	}
	
	public static void unsuscribeAccounts(BankAccount account) {
		for (int i=0; i<bankAccountList.size();i++) {
			if (account==bankAccountList.get(i))
				bankAccountList.remove(i);
		}
	}
	
	public String maxBalance() {
		StringBuilder sBuilderMax = new StringBuilder();
		sBuilderMax.append(bankAccountList.get(0));
		double max = bankAccountList.get(0).getBalance();
		
		if (bankAccountList.size()==0)
			return "No content";
		
		for (int i=0; i<bankAccountList.size();i++) {
			if (bankAccountList.get(i).getBalance()>max) {
				sBuilderMax.setLength(0);
				max = bankAccountList.get(i).getBalance();
				sBuilderMax.append(bankAccountList.get(i));
			}
		}
		
		return sBuilderMax+"";
	}
	
	public String minBalance() {
		StringBuilder sBuilderMin = new StringBuilder();
		sBuilderMin.append(bankAccountList.get(0));
		double min = bankAccountList.get(0).getBalance();
		
		for (int i=0; i<bankAccountList.size();i++) {
			if (bankAccountList.get(i).getBalance()<min) {
				sBuilderMin.setLength(0);
				min = bankAccountList.get(i).getBalance();
				sBuilderMin.append(bankAccountList.get(i));
			}
		}
		
		return sBuilderMin+"";
	}
	
	public double averageBalance() {
		double sum=0;
		
		for (int i = 0; i<bankAccountList.size();i++){
			sum+=bankAccountList.get(i).getBalance();
		}
		return sum/bankAccountList.size();
	}
}
