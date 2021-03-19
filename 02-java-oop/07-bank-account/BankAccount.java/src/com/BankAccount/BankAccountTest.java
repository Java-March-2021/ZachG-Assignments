package com.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ab = new BankAccount();
		
		ab.getAccountNumber();
		ab.depositMoney(500, "savings");
		ab.depositMoney(600, "checking");
		ab.totalMoney();
		
		System.out.println(BankAccount.total);
		
		ab.withdrawMoney(200, "savings");
		ab.withdrawMoney(300, "checking");
		ab.totalMoney();
		System.out.println(BankAccount.total);
	}

}
