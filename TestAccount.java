public  class TestAccount{

	/**Main method*/
	public static void main(String[] args){

		/**Create Scanner object*/
		Scanner input = new Scanner(System.in);

		/**Print the data of the guest*/
		System.out.println("Hellow guest! \nID : 1122 \nBalance : 20000 \nAnnual Interest Rate : 4.5%");
		System.out.println("Which service do you want ? \nChecking account(press \"1\") or Saving account(press \"2\")");	
		
		/**Definite the variable*/
		int service = input.nextInt();
		int money;

		/**Enter the checking account service */
		if(service == 1){

			System.out.println("withdraw money : ");
			
			money = input.nextInt();
			
			/**Create check object*/
			CheckingAccount check = new CheckingAccount(1122, 20000, money);

			/**Invoke setAnnualInterestRate method to record the annual interest rate*/
			check.setAnnualInterestRate(4.5);

			/**Invoke the toString method to print the result*/
			System.out.println(check.toString());
		
		/**Enter the saving account service */
		}else if(service == 2){
		
			System.out.println("save money : ");
			
			money = input.nextInt();
			
			/**Create save object*/
			SavingsAccount save = new SavingsAccount(1122, 20000, money);
		
			/**Invoke setAnnualInterestRate method to record the annual interest rate*/
			save.setAnnualInterestRate(4.5);

			/**Invoke the toString method to print the result*/
			System.out.println(save.toString());
	
		}else{
	
			System.out.println("No exist this service!");
		}		
	}
}
