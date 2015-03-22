public  class TestAccount{


	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Hellow guest! \nID : 1122 \nBalance : 20000 \nAnnual Interest Rate : 4.5%");
		System.out.println("Which service do you want ? \nChecking account(press \"1\") or Saving account(press \"2\")");	
		
		int service = input.nextInt();
		int money;

		if(service == 1){

			System.out.println("withdraw money : ");
			
			money = input.nextInt();
			
			CheckingAccount check = new CheckingAccount(1122, 20000, money);

			check.setAnnualInterestRate(4.5);

			System.out.println(check.toString());
		
		}else if(service == 2){
		
			System.out.println("save money : ");
			
			money = input.nextInt();
			
			SavingsAccount save = new SavingsAccount(1122, 20000, money);
		
			save.setAnnualInterestRate(4.5);

			System.out.println(save.toString());
	
		}else{
	
			System.out.println("No exist this service!");
		}		
	}
}
