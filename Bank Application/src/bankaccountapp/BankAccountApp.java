package bankaccountapp;

import java.util.LinkedList;
import java.util.List;
/*
 * @Author: Surafel seboka
 * @Title: New Bank Account Application
 */

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();	
		
		// read a a CSV file
		
		String file = "C:\\Users\\Surage_Mars\\Desktop\\JavaProjects\\NewBankAccounts.csv";
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder) {
			
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initdeposit= Double.parseDouble(accountHolder[3]);	
						
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initdeposit));
			} else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN,initdeposit));
			}
			else {
				System.out.println("ERROR READING ACCCOUNT");
			}
			
		}
		for (Account acc: accounts) {
			System.out.println("\n***********************");
			acc.showInfo();
			
		}		
	}

}
