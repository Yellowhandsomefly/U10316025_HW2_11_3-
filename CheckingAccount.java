public class CheckingAccount extends Account{

	/**data field*/
	private double withdrawMoney;

	/**a no-arg constructor to initialize data field*/
	CheckingAccount(){

		super();	
		withdrawMoney = 0;
	}

	/**a constructor to give the value to data field*/
	CheckingAccount(int iid, double bbalance, double wwithdrawMoney){

		super(iid, bbalance);
		this.withdrawMoney = wwithdrawMoney;
		withdrawMoney = overdraft(withdrawMoney);
		super.withdraw(withdrawMoney);
	}
	
	/**a method to invoke setAnnualInterestRate method of the superclass to set annual interest rate*/
	public void setAnnualInterestRate(double annualInterestRate){

		super.setAnnualInterestRate(annualInterestRate);
	}
	
	/**a set method to set withdraw money*/		
	public void setWithdrawMoney(double wwithdrawMoney){
	
		this.withdrawMoney = wwithdrawMoney;
		withdrawMoney = overdraft(withdrawMoney);
		super.withdraw(withdrawMoney);
	}
	
	/**a get method to return withdraw money*/		
	public double getWithdrawMoney(){

		return withdrawMoney;
	}

	/**decide if the account has the overdraft limit*/
	public double overdraft(double withdrawMoney){

		double balance = super.getBalance();
		
		if(balance < withdrawMoney){

			System.out.println("Your balance is less than withdraw Money");
		
			withdrawMoney = 0;
		}

		return withdrawMoney;
	}
	
	@Override
	public String toString(){

		return "---------------------------------------\nWithdraw Money : " + getWithdrawMoney() + "\n" + super.toString();
	}
}
