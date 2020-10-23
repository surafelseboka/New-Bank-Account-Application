package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking checkacc1 = new Checking("Tom Wilson ","12345678", 1500);
		
		Savings savcc1 = new Savings("hillary low", "34567890",2500);
		// Read a CSV file then create new account based on that data
		
		savcc1.showInfo();
		System.out.println("**************");
		checkacc1.showInfo();
		
		
	}

}
