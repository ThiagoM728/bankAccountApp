package bankAccountApp;

public class Checking extends Account{
	
	private int debitCardNumber;
	private int debitCardPin;
	
	public Checking(String name, String sSN, double initDeposit) {
		
		super(name, sSN, initDeposit);
		accNumber = "2" + accNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}

	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
		
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"- Your Checking Account Info -"+
				"\nDebit Card Number: " + debitCardNumber +
				"\nDebit Card PIN: " + debitCardPin
				);
	}
}
