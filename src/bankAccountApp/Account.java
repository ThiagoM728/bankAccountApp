package bankAccountApp;

public abstract class Account implements IBaseRate{
	
	private String name;
	private String sSN;
	private double balance;
	private static int index = 10000;
	protected String accNumber;
	protected double rate;
	
	// constructor
	public Account(String name, String sSN, double initDeposit) {
		
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
		
		index++;
		this.accNumber = setAccountNumber();
		
		setRate();
		
	}
	
	public abstract void setRate();
	
	//account number setter
	private String setAccountNumber() {
		
		//get last two digits of sSN
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		
		//unique id
		int uniqueID = index;
		
		// three digit random number
		int randNumber = (int)( Math.random() * Math.pow(10, 3));
		
		return lastTwoOfSSN + uniqueID + randNumber;
	}
	
	// set compound interest
	public void compound() {
		double accruedInterest =  balance * (rate/100);
		balance += accruedInterest;
		System.out.println("Accrued interest: $" + accruedInterest);
		printBalance();
	}
	
	// Transaction methods
	public void deposit(double amount) {
		balance +=  amount;
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	
	// show info
	public void showInfo() {
		System.out.println(
				"Name: " + name +
				"\nAccount Number: " + accNumber +
				"\nBalance: " + balance +
				"\nRate: " + rate + "%"
				);
	}
}






















