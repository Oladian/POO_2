package com.iesvirgendelcarmen.ejercicios;
import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	static List<BankAccount> bankAccountList = new ArrayList<>();
	private String nameBank;
	private List<BankAccount> listAccount;
	
	public Bank(String nameBank) {
		this.nameBank = nameBank;
		this.listAccount = new ArrayList<>();
	}

	// Hecho por Manolo
	
	public boolean addAccount(BankAccount bankAccount) {
		return listAccount.add(bankAccount);
	}
	
	public boolean removeAccount(BankAccount bankAccount) {
		return listAccount.remove(bankAccount);
	}
	
	public List<BankAccount> getGreaterBalanceAccount() {
		List<BankAccount> greaterListAccount = new ArrayList<>();
		double minBalance = greaterListAccount.get(0).getBalance();
		
		BankAccount bankAccountGreaterBalance =	greaterListAccount.get(0);
		
		for (BankAccount bankAccount : listAccount) {
			if (bankAccount.getBalance()>=minBalance) {
				if (bankAccount.getBalance()>minBalance) {
					greaterListAccount.clear();
					minBalance = bankAccount.getBalance();
					bankAccountGreaterBalance=bankAccount;
					}
				greaterListAccount.add(bankAccount);
			}
			
		}

		return greaterListAccount;
	}
	
	
	// Hecho por mi
	
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
	
	public List<String> maxBalance() {
		List<String> maxList = new ArrayList<>();
		double max = bankAccountList.get(0).getBalance();
		
		if (bankAccountList.size()==0)
			return maxList;
		
		for (int i=0; i<bankAccountList.size();i++) {
			if (bankAccountList.get(i).getBalance()==max) {
				maxList.add(bankAccountList.get(i)+"");
			}
			if (bankAccountList.get(i).getBalance()>max) {
				maxList.clear();
				maxList.add(bankAccountList.get(i)+"");
				max = bankAccountList.get(i).getBalance();
			}
		}
		return maxList;
	}
	
	public List<String> minBalance() {
		List<String> minList = new ArrayList<>();
		double min = bankAccountList.get(0).getBalance();
		
		if (bankAccountList.size()==0)
			return minList;
		
		for (int i=0; i<bankAccountList.size();i++) {
			if (bankAccountList.get(i).getBalance()==min) {
				minList.add(bankAccountList.get(i)+"");
			}
			
			if (bankAccountList.get(i).getBalance()<min) {
				minList.clear();
				minList.add(bankAccountList.get(i)+"");
				min = bankAccountList.get(i).getBalance();
			}
		}
		return minList;
	}
	
	public double averageBalance() {
		double sum=0;
		
		for (int i = 0; i<bankAccountList.size();i++){
			sum+=bankAccountList.get(i).getBalance();
		}
		return sum/bankAccountList.size();
	}
}
