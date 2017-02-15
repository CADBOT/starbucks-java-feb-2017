package oop;

public class BankApp {
    public static void main(String[] args) {
    	  {
    	    int x = 4;	
    	  }
    	  System.out.println(x);
    }

    /*
    static void greet() {
      System.out.println("Hello betty");	
    }
    */
    static void greet() {
    	  //greet("Betty", "Hello");
    	  greet("Betty");
    }
    
    /*
    static void greet(String name) {
    	  System.out.println(name + " hello");
    }
    */
    static void greet(String name) {
    	  greet(name, "Hola");
    }
    
    static void greet(String name, String greeting) {
      System.out.println(name + " " + greeting);	
    }
}

class BankAccount {
	private double balance = 1000;
	public String acctNumber;
	void setAcctNumber(String acctNumber) {
	  if (acctNumber.length() >= 10) {
		  this.acctNumber = acctNumber;
	  }
	}
	
	public double getBalance() {
		return balance;
	}
	
	double withdraw() {
		return withdraw(20);
	}

	double withdraw(double amt) {
		if ((balance - amt) >= 100) {
			balance -= amt;
			return amt;
		}
		return 0;
	}
	
	void deposit(double amt) {
		if (amt >= 0) {
			balance += amt;
		}
	}
	
	/*
	double getBalance() {
	  return balance;	
	}
	
	void setBalance(double balance) {
		this.balance = balance;
	}
	*/
	
	/*
	void setBalance(double newBalance) {
	  balance = newBalance;	
	}
	*/
}