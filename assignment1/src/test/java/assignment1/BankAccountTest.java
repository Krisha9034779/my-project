package assignment1;
import static org.junit.Assert.assertEquals;




import org.junit.Test;

public class BankAccountTest {
    @Test
    public void testInitialBalance() {
    	
    	 BankAccount account =  new BankAccount(100.0); 
         assertEquals(100.0, account.getBalance(), 0.01);
    }
    @Test
  	 public void testDeposit() { 
  	     //account.deposit(50.0); 
  		  BankAccount account =  new BankAccount(150.0); 
  	     assertEquals(150.0, account.getBalance(), 0.01);
  	  }
    @Test(expected = IllegalArgumentException.class) 
	  public void testDepositNegativeAmount() {
		  BankAccount account = new BankAccount(100.0);
	      account.deposit(-10.0);
	  }
    @Test 
	  public void testWithdraw() { 
    BankAccount account = new BankAccount(100.0);
    account.withdraw(50.0); 
	  assertEquals(50.0, account.getBalance(), 0.01); 
	  }
    @Test(expected = IllegalArgumentException.class)
	  public void testWithdrawInsufficientFunds() {
		  BankAccount account = new  BankAccount(100.0);
		  account.withdraw(200.0); // Trying to withdraw more than the balance
	  }
	 
	  @Test(expected = IllegalArgumentException.class)
	  public void testWithdrawNegativeAmount() {
      BankAccount account = new BankAccount(100.0);
	   account.withdraw(-50.0); // Negative withdrawal
	  }
	  
	  @Test
	    public void testMultipleDeposits() {
	        BankAccount account = new BankAccount(100.0);
	        account.deposit(50.0);
	        account.deposit(25.0);
	        assertEquals(175.0, account.getBalance(), 0.01);
	    }
	  @Test
	    public void testMultipleWithdrawals() {
	        BankAccount account = new BankAccount(200.0);
	        account.withdraw(50.0);
	        account.withdraw(25.0);
	        assertEquals(125.0, account.getBalance(), 0.01);
	    }
	  @Test
	    public void testLargeDeposit() {
	        BankAccount account = new BankAccount(100.0);
	        account.deposit(1000000.0); // Large deposit
	        assertEquals(1000100.0, account.getBalance(), 0.01);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testNegativeInitialBalance() {
	        new BankAccount(-100.0); // Initial balance is negative
	    }
	    
	    @Test
	    public void testZeroInitialBalance() {
	        BankAccount account = new BankAccount(0.0);
	        assertEquals(0.0, account.getBalance(), 0.01);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testWithdrawZeroAmount() {
	        BankAccount account = new BankAccount(100.0);
	        account.withdraw(0.0);
	    }
}
	 
	 
        
    


	
	 
	 
		
		
		  
		 
	  
	
			
			 
	  
		
		
		 
		
			
			
		
			
 


