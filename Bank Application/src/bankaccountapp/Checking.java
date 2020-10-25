package bankaccountapp;

public class Checking extends Account {

	// list properties specific to a checking account	
	
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	
	public Checking(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit);		
		accountNumber = "2" + accountNumber;
		setDebitCard();		
	}
	
	@Override
	public void setRate() {
		
		rate =getBaseRate() - 0.25; 
	}
	
	
	private void setDebitCard() {
		
		debitCardNumber =(int)(Math.random()*Math.pow(10, 12));
		debitCardPIN = (int)(Math.random()*Math.pow(10, 4));		
		
	}
	// List any methods specific to the checking accounts
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"\n Your Checking Account features" +
					"\n Debit Card Number: "+ debitCardNumber +
					"\n Debit Card Pin: "+ debitCardPIN	
									);
			
	}
	
	
}
