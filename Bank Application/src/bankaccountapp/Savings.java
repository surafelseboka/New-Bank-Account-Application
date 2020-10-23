package bankaccountapp;

public class Savings extends Account {

	// list properties specific to a saving account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//Constructor to initialize saving account properties
	public Savings(String name, String sSN, double initDeposit) {
	
		super(name,sSN,initDeposit);	
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
			
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
		
	}
	
	
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}
	// List any methods specific to the saving accounts
 
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"\n Your Saving Account Features" +
				"\n Safety Deposit Box ID: "+safetyDepositBoxID +
				"\n Safety Deposit Box key: "+safetyDepositBoxKey);
	}

	
}
