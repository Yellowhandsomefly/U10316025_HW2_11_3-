public class CheckingAccount extends Account{

	/**data field*/
	private double withdrawMoney;
	private double savingMoney;

	/**a no-arg constructor to initialize data field*/
	CheckingAccount(){

		super();	
		
	}

	/**a constructor to give the value to data field*/
	CheckingAccount(int iid, double bbalance){

		super(iid, bbalance);
		
	}
	
	/**a method to invoke setAnnualInterestRate method of the superclass to set annual interest rate*/
	public void setAnnualInterestRate(double annualInterestRate){

		super.setAnnualInterestRate(annualInterestRate);
	}
	
	/**a method to withdraw and record the new balance*/
	public void withdraw(double withdraw){

		double money;
		money = overdraft(withdraw);
		super.withdraw(money);
	}

	/**a method to deposit and record the new balance*/
	public void deposit(double deposit){
	
		super.deposit(deposit);
	}
	
	/**decide if the account has the overdraft limit*/
	public double overdraft(double withdrawMoney){

		double balance = super.getBalance();
		
		if(balance - withdrawMoney < -5000){

			System.out.println("Your balance is less $5000 than withdraw Money");
		
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
	
