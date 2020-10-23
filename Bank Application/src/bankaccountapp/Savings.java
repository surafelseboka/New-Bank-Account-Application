package bankaccountapp;

public class Savings extends Account {

	// list properties specific to a saving account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//Constructor to initialize saving account properties
	public Savings(String name, String sSN, double initDeposit) {
	
		super(name,sSN,initDeposit);	
		accountNumber = "1" + accountNumber;
			
	}
	// List any methods specific to the saving accounts
 
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Savings " );
	}
}
