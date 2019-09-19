import java.util.ArrayList;

public class Solution {
	String name;
	ArrayList<Account> bankAccounts;
	
	public Solution() {
		name = "";
		bankAccounts = new ArrayList<>();	
	}
	
	public Solution(String name, ArrayList accounts) {
		this.name = name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// invoke a deposit test
		Solution test = new Solution();
		
		
		

	}
	
	class Account {
		String owner;
		int balance;
		
		public Account() {
			owner = "";
			balance = 0;
		}
		
		public void deposit(int num) {
			balance = balance + num;
		}
		
		public void withdraw(int num) {
			if(num > 1000) {
				System.out.println("Withdrawal limit is 1000 dollars!");
			}
			if(num >= balance) {
				balance = balance -num;
			}
			else {
				System.out.println("You do not have sufficient balance to withdraw this amount!");
			}
		}
		
		public void transfer(int num) {
			
		}
		
	}

	// inherits from Account superclass
	class Checking extends Account {
		
	}

	//inherits from Account superclass
	class Savings extends Account {
		
	}

	class Individual extends Checking {
		
	}

	class MoneyMarket extends Checking {
		
	}

}





