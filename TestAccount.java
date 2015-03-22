import java.util.Date;
import java.util.Scanner;
public  class TestAccount{

	/**Main method*/
	public static void main(String[] args){

		/**Create Scanner object*/
		Scanner input = new Scanner(System.in);
	
		/**Definite the variable*/
		int service;
		double money;

		/**Print the data of the guest*/
		System.out.println("Hellow guest! \nID : 1122 \nBalance : 20000 \nAnnual Interest Rate : 4.5%");
		
		System.out.println("Account : \nWhich service do you want? withdraw (press \"1\") or deposit (press \"2\") ");
		
		service = input.nextInt();

		System.out.println("How much money?");
		
		money = input.nextDouble();

		Account account = new Account(1122, 20000);
	
		/**Invoke setAnnualInterestRate method to record the annual interest rate*/
		account.setAnnualInterestRate(4.5);

		if(service == 1){
		
			account.withdraw(money);		
		
		}else if(service == 2){
		
			System.out.println("Saving Money : " + money); 
			account.deposit(money);
		}else{
			
			System.out.println("No exist the service");
		}

		System.out.println(account.toString());

		
		System.out.println("\nCheckingAccount : \nWhich service do you want? withdraw (press \"1\") or deposit (press \"2\") ");
		
		service = input.nextInt();
		
		System.out.println("How much money? \nChecking acccount has an overdraft limit $5000 .");		

		money = input.nextDouble();

		/**Create check object*/
		CheckingAccount check = new CheckingAccount(1122, 20000);

		/**Invoke setAnnualInterestRate method to record the annual interest rate*/
		check.setAnnualInterestRate(4.5);

		if(service == 1){
		
			check.withdraw(money);		
		
		}else if(service == 2){

			System.out.println("Saving Money : " + money); 
			check.deposit(money);
		}else{
			
			System.out.println("No exist the service");
		}

		/**Invoke the toString method to print the result*/
		System.out.println(check.toString());
		
		
		System.out.println("\nSavingsAccount : \nWhich service do you want? withdraw (press \"1\") or deposit (press \"2\") ");
		
		service = input.nextInt();
				
		System.out.println("How much money? \nSaving account cannot be overdrawn!");
		
		money = input.nextDouble();
		
		/**Create save object*/
		SavingsAccount save = new SavingsAccount(1122, 20000);
		
		/**Invoke setAnnualInterestRate method to record the annual interest rate*/
		save.setAnnualInterestRate(4.5);

		if(service == 1){
		
			save.withdraw(money);		
		
		}else if(service == 2){
	
			System.out.println("Saving Money : " + money); 
			save.deposit(money);
		}else{
			
			System.out.println("No exist the service");
		}

		/**Invoke the toString method to print the result*/
		System.out.println(save.toString());
	
		
	}
}
