package bankaccountapp;


public abstract class Account implements IRate {

	// List common properties for saving and checking accounts
	
	private String name;
	private String sSN; 
	private double balance;
	private static int  index = 10000;
	
	protected String accountNumber;
	protected double rate;
	
	
	// Constructor to set base properties and initialize the account 
	
	public Account(String name, String sSN , double initDeposit) {
		
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
		
		//set account numbers 
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
		
			}
	
	public abstract void setRate();

	private String setAccountNumber () {
		
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int randomNumber = (int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSSN + index + randomNumber;
		
	}
	
	public void compound() {
		double accuredInterset = balance * (rate/100);
		balance = balance + accuredInterset;
		System.out.println("Accured Interet $" + accuredInterset);
		printBalance();
		
	}	

	// List common methods
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit: $" + balance);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("withdraw: $"+ balance);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfer: $"+ balance + "to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);		
	}
	
	public void showInfo() {
		
		System.out.println( 
			"NAME: " + name + 
			"\nACCOUNT NUMBER: " + accountNumber +
			"\nBALANCE: $" + balance +
			"\nRATE: " + rate + "%" 
				);
		
	}
	
}
