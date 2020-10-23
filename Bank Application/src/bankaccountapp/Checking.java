package bankaccountapp;

public class Checking extends Account {

	// list properties specific to a checking account	
	int debitCardNumber;
	int debitCardPIN;
	
	// Constructor to initialize checking account properties
	
	public Checking(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit);		
		accountNumber = "2" + accountNumber;
		
	}
	// List any methods specific to the checking accounts
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checking " );
	}
	
	
}
