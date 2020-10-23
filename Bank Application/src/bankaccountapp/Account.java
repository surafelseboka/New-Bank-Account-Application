package bankaccountapp;


public abstract class Account implements IRate {

	// List common properties for saving and checking accounts
	
	String name;
	String sSN; 
	double balance;
	String accountNumber;
	double rate;
	static int  index = 10000;
	
	
	// Constructor to set base properties and initialize the account 
	
	public Account(String name, String sSN , double initDeposit) {
		
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
		
		//set account numbers 
		
		this.accountNumber = setAccountNumber();
		index++;
	}
	

	private String setAccountNumber () {
		
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int randomNumber = (int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSSN + index + randomNumber;
		
	}
	
public void showInfo() {
		
		System.out.println( 
			"NAME: " + name +
			"\nACCOUNT NUMBER: " + accountNumber +
			"\nBALANCE: $" + balance );
		
	}
	
	// List common methods
}
