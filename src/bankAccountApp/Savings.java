package bankAccountApp;

public class Savings extends Account{
	
	private int safetyDepositBoxKey;
	private int safetyDepositBoxID;
	
	public Savings(String name, String sSN, double initDeposit) {
		
		super(name, sSN, initDeposit);
		accNumber = "1" + accNumber;
		setSafetyDepositBox();
	}
	
	//safetyDepositBox setter
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	public void showInfo() {
		
		super.showInfo();
		System.out.println(
				"- Your Savings Account Info -" +
				"\nSafety Deposit Box ID: " + safetyDepositBoxID +
				"\nSafety Deposit Box Key: " + safetyDepositBoxKey
				);
		
	}
}
