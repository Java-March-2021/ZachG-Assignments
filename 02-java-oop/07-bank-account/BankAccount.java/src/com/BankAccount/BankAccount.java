package com.BankAccount;
import java.util.Random;

public class BankAccount {
	protected String accountNumber;
	protected double checkingBalance = 0;
	protected double savingsBalance = 0;
	protected static int numberOfAccounts = 0;
	public static int total = 0;
	public static String getId() {
		String subst = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			subst += r.nextInt(10);
		}
		return subst;
	}
	
	public BankAccount(String accountNumber, double checkingBalance, double savingsBalance, int total) {
		this.accountNumber = accountNumber;
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		BankAccount.total = total;
		numberOfAccounts += 1;
		this.accountNumber = BankAccount.getId();
	}
	
	public BankAccount() {
		
	}

	public void depositMoney(double deposit, String account) {
		
		if(account.equals("savings"))
			this.savingsBalance += deposit;
		else if(account.equals("checking"))
			this.checkingBalance += deposit;
		BankAccount.total += deposit; 
		}
	
	public void withdrawMoney(double withdraw, String account) {
		
		boolean successful = false;
		if(account.equals("savings")) {
			if(this.savingsBalance - withdraw >= 0) {
				successful = true;
				this.savingsBalance -= withdraw;
			}
		}else if(account.equals("checking")) {
			if(this.checkingBalance - withdraw >= 0) {
				successful = true;
				this.checkingBalance -= withdraw;
			}
		}
		if (successful) {
		BankAccount.total -= withdraw;
		}	
	}
	
	public void totalMoney() {
		double total = this.checkingBalance + this.savingsBalance;
		System.out.println("The total is now : " + total);
	}
	
		
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
}
