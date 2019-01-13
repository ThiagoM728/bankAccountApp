package bankAccountApp;

import java.util.List;

public class BankAccountApp {
	
	public static void main(String[] args) {
		
		// read from csv file
		String file = "/Users/T/eclipse-workspace/bankAccountApp/src/utilities/NewBankAccounts.csv";
		List<String[]> newAccounts = new utilities.CSV().read(file);
		
		//iteration for visualization of new accounts added
		for(String[] account : newAccounts) {
			System.out.println(account[0]);
			System.out.println(account[1]);
			System.out.println(account[2]);
			System.out.println(account[3]);
		}
		
		
		/* TEST DRIVER
		Checking acc1 = new Checking("Joe Rogan", "627395616", 1000);
		Savings acc2 = new Savings("Jorge Lopes", "862042735", 1500);
		
		acc1.showInfo();
		acc1.compound();
		System.out.println("**********************************");
		acc2.showInfo();
		acc2.compound();
		*/
		
	}

}
