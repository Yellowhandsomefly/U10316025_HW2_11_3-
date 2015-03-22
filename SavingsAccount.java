public class SavingsAccount extends Account{

	/**data field*/
	private double savingMoney;

	/**a no-arg constructor to initialize data field*/
	SavingsAccount(){

		super();	
		savingMoney = 0;
	}

	/**a constructor to give the value to data field*/
	SavingsAccount(int iid, double bbalance, double ssavingMoney){

		super(iid, bbalance);
		this.savingMoney = ssavingMoney;
		super.deposit(savingMoney);
	}
	
	/**a method to invoke setAnnualInterestRate method of the superclass to set annual interest rate*/
	public void setAnnualInterestRate(double annualInterestRate){

		super.setAnnualInterestRate(annualInterestRate);
	}
	
	/**a set method to set saving money*/
	public void setSavingMoney(double ssavingMoney){
	
		this.savingMoney = ssavingMoney;
		super.deposit(savingMoney);
	}
	
	/**a get method to return saving money*/
	public double getSavingMoney(){

		return savingMoney;
	}

	@Override
	public String toString(){

		return "---------------------------------------\nSaving Money : " + getSavingMoney() + "\n" + super.toString();
	}
}
	
