package com.iesvirgendelcarmen.ejercicios;
import java.util.ArrayList;
import java.util.List;
/**
 * @Class Bank
 * @author Izan
 * @version 1
 */


public class Bank {
	
	static List<BankAccount> bankAccountList = new ArrayList<>();
	private String bankName;
	private int coincidencias=0;
	private List<BankAccount> listAccount;
	
	/**
	 * 
	 * @param String - nameBank name of the bank
	 * 
	 */
	
	public Bank(String nameBank) {
		this.bankName = nameBank;
		this.listAccount = new ArrayList<>();
	}
	
	

	// Hecho por Manolo
	
	/**
	 * 
	 * @param bankAccount BankAccount -
	 * @return true if, only if add a new accounts is saccessfully
	 * 
	 */
	
	public boolean addAccount(BankAccount bankAccount) {
		if (listAccount.contains(bankAccount)) {
			return listAccount.add(bankAccount);
		}
		else {
			coincidencias++;
			return false; 
		}
	}
	/**
	 * 
	 * @return
	 */
	public int getCoincidencias() {
		return coincidencias;
	}
	/**
	 * 
	 * @param coincidencias
	 */
	public void setCoincidencias(int coincidencias) {
		this.coincidencias = coincidencias;
	}
	/**
	 * 
	 * @param bankAccount
	 * @return
	 */
	public boolean removeAccount(BankAccount bankAccount) {
		return listAccount.remove(bankAccount);
	}
	/**
	 * 
	 * @return
	 */
	public List<BankAccount> getGreaterBalanceAccount() {
		
		List<BankAccount> listGreaterAccount = new ArrayList<>();
		double maxBalance = listAccount.get(0).getBalance();
		
		for (BankAccount bankAccount : listAccount) {
			if (bankAccount.getBalance()>=maxBalance) {
				if (bankAccount.getBalance()>maxBalance) {
					listGreaterAccount.clear();
					maxBalance = bankAccount.getBalance();
					}
				listGreaterAccount.add(bankAccount);
			}	
		}
		return listGreaterAccount;
	}
	/**
	 * 
	 * @return
	 */
	public List<BankAccount> getSmallerBalanceAccount() {
		
		List<BankAccount> listSmallerAccount = new ArrayList<>();
		double minBalance = listAccount.get(0).getBalance();
		
		for (BankAccount bankAccount : listAccount) { // listAccount.size()
			if (bankAccount.getBalance()<=minBalance) {
				if (bankAccount.getBalance()<minBalance) {
					listSmallerAccount.clear();
					minBalance = bankAccount.getBalance();
					}
				listSmallerAccount.add(bankAccount);
			}	
		}
		return listSmallerAccount;
	}
	/**
	 * 
	 * @return
	 */
	public double calculateAverageBalance() {
		double sum=0;
		for (BankAccount bankAccount : listAccount) {
			sum+=bankAccount.getBalance();
		}
		return sum/listAccount.size();
	}
	// Hecho por mi
/*	
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
*/	
	
	/**
	 * 
	 * @return
	 */
	
	public double averageBalance() {
		double sum=0;
		
		for (int i = 0; i<bankAccountList.size();i++){
			sum+=bankAccountList.get(i).getBalance();
		}
		return sum/bankAccountList.size();
	}
	
	/**
	 * 
	 */
	
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", listAccount=" + listAccount + ", getGreaterBalanceAccount()="
				+ getGreaterBalanceAccount() + ", getSmallerBalanceAccount()=" + getSmallerBalanceAccount()
				+ ", calculateAverageBalance()=" + Math.round(100*calculateAverageBalance())/100.0 + "]"; 
	}

	
	
}
