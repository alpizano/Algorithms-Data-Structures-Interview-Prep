import java.util.ArrayList;


public class Bank extends Account {
	String name;
	ArrayList<Account> bankAccounts;
	
	public Bank() {
		name = "";
		bankAccounts = new ArrayList<>();	
	}
	
	public Bank(String name) {
		this.name = name;
		bankAccounts = new ArrayList<>();	
	}
	
	// need to fix this constructor
	public Bank(String name, ArrayList bankAccounts) {
		this.name = name;
		this.bankAccounts = bankAccounts;
	}
	
	public void addAccount(String owner, int balance) {
		Account new_acct = new Account(owner, balance);
		bankAccounts.add(new_acct);
	}
	
	public void withdraw(String accountName, int num) {
		for(Account a: bankAccounts ) {
			if(a.owner.equals(accountName)) {
				if(num > 1000) {
					System.out.println("Withdrawal limit is 1000 dollars!");
				}
				if(num >= balance) {
					a.balance = a.balance - num;
				}
				else {
					System.out.println("You do not have sufficient balance to withdraw this amount!");
				}
				
			}
		}
	}
	
	
	class Account {
		String owner;
		int balance;
		
		public Account() {
			owner = "";
			balance = 0;
		}
		
		public Account(String owner, int balance) {
			this.owner = owner;
			this.balance = balance;
		}
		
		/*
		 * public void deposit(int num) { balance = balance + num; }
		 * 
		 * public void withdraw(int num) { if(num > 1000) {
		 * System.out.println("Withdrawal limit is 1000 dollars!"); } if(num >= balance)
		 * { balance = balance -num; } else { System.out.
		 * println("You do not have sufficient balance to withdraw this amount!"); } }
		 * 
		 * public void transfer(int num) {
		 * 
		 * }
		 */
		
	}
	

	//inherits from Account superclass
		class Checking extends Account {
			
		}

		//inherits from Account superclass
		class Savings extends Account {
			
		}

		class Individual extends Checking {
			
		}

		class MoneyMarket extends Checking {
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// invoke a deposit test
		Bank sample_bank = new Bank("Javier's Bank");
		sample_bank.addAccount("Javier's Account", 500);
		sample_bank.addAccount("Matt Massoms Account", 666);
		sample_bank.addAccount("Preston's account", 9999);
		
		// testing deposit values
		for(Account a: sample_bank.bankAccounts) {
			System.out.println("The owner of this account is: " + a.owner + " and the balance is: " + a.balance);
		}
		
		// invoke withdrawal
		sample_bank.withdraw("Javier's Account", 300);
		sample_bank.withdraw("Matt Massoms Account", 600);
		sample_bank.withdraw("Preston's account", 10000);
		
		// testing withdrawal values
		for(Account a: sample_bank.bankAccounts) {
			System.out.println("The owner of this account is: " + a.owner + " and the balance is: " + a.balance);
		}
	}
}





