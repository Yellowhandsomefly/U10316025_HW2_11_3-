public class SavingsAccount extends Account{

	private double savingMoney;

	SavingsAccount(){

		super();	
		savingMoney = 0;
	}

	SavingsAccount(int iid, double bbalance, double ssavingMoney){

		super(iid, bbalance);
		this.savingMoney = ssavingMoney;
		super.deposit(savingMoney);
	}
	
	public void setAnnualInterestRate(double annualInterestRate){

		super.setAnnualInterestRate(annualInterestRate);
	}
	
	public void setSavingMoney(double ssavingMoney){
	
		this.savingMoney = ssavingMoney;
		super.deposit(savingMoney);
	}
	
	public double getSavingMoney(){

		return savingMoney;
	}

	@Override
	public String toString(){

		return "---------------------------------------\nSaving Money : " + getSavingMoney() + "\n" + super.toString();
	}
}
	
