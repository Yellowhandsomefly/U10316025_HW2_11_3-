public class SavingsAccount extends Account{

	/**a no-arg constructor to initialize data field*/
	SavingsAccount(){

		super();	
	}

	/**a constructor to give the value to data field*/
	SavingsAccount(int iid, double bbalance){

		super(iid, bbalance);
	}
	
	/**a method to invoke setAnnualInterestRate method of the superclass to set annual interest rate*/
	public void setAnnualInterestRate(double annualInterestRate){

		super.setAnnualInterestRate(annualInterestRate);
	}
	
	/**a method to withdraw and record the new balance*/
	public void withdraw(double wwithdraw){
		
		double money;	
		money = overdraft(wwithdraw);
		super.withdraw(money);
	}

	/**a method to deposit and record the new balance*/
	public void deposit(double deposit){
	
		super.deposit(deposit);
	}
	
	/**decide if the account has the overdraft limit*/
	public double overdraft(double withdrawMoney){

		double balance = super.getBalance();
		
		if(balance < withdrawMoney){

			System.out.println("Your balance is less than withdraw Money\nSaving account cannot be overdrawn!");
		
			withdrawMoney = 0;
		}
		
		System.out.println("Withdraw Money : " + withdrawMoney);
		return withdrawMoney;
	}

	@Override
	public String toString(){

		return super.toString();
	}
}
	
