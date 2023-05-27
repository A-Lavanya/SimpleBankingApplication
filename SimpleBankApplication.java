package bankApplication;

import java.util.Scanner;  


public class SimpleBankApplication 
{
	 private static String accno;  
	    static String name;  
	    static String acc_type;  
	    static long balance, amt;  
	    
	    Scanner sc = new Scanner(System.in);  
	    
	    //method to display account details  
	    public void showAccount() 
	    {  
	     	System.out.print("Enter Account No : ");  
	        accno = sc.next();  
	        System.out.print("Enter Name : ");  
	        name = sc.next();  
	        System.out.print("Enter Account type : ");  
	        acc_type = sc.next();  
	        
	        System.out.println("Name of account holder: " + name);  
	        System.out.println("Account no.: " + accno);  
	        System.out.println("Account type: " + acc_type);  
	        
	    }
	    //method to check balance
	    public void balance()
	    {
	    	balance = 3000;   	
	    }
	    	    
	    //method to deposit money  
	    public void deposit() 
	    {  
	        System.out.println("Enter the amount you want to deposit : ");  
	        amt = sc.nextLong();  
	        balance = balance + amt;  
	        System.out.println(" your "+amt+" amount is successfully deposit to your account........"); 
	        System.out.println("total amount after deposit : " +balance);
	    }
	    
	    //method to withdraw money  
	    public void withdrawal() 
	    {   
	        System.out.println("Enter the amount you want to withdraw : ");  
	        amt = sc.nextLong();  
	        if (balance >= amt) 
	        {  
	            balance = balance - amt;  
	           
	            System.out.println(" your "+amt+" amount is successfully withdrawal from your account........"); 
	            System.out.println("Balance amount after withdrawal: " + balance);  
	        } 
	        else 
	        {  
	            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
	        }  
	    }  
	    
	void output()
	{
	Scanner scr = new Scanner(System.in);  
	
    // loop runs until number 5 is not pressed to exit  
    int ch;  
    do {  
        System.out.println("*****Indian Banking System Application*****");  
        System.out.println("\n-------------Welcome to our bank-----------");
        System.out.println("1. Display all account details");
        System.out.println("2. Check balance");
        System.out.println("3. Deposit the amount");
        System.out.println("4. Withdraw the amount");
        System.out.println("5.Exit");
        
        System.out.println("Enter your choice: ");  
        ch = scr.nextInt();

            switch (ch) {  
                case 1:
                        showAccount();   
                    break;  
                case 2:  
                	balance();
                    System.out.println("your account balance is : "+balance);  
                   
                    break;  
                case 3:  
                    balance();
                	deposit(); 
                    break;  
                case 4:  
                	balance();
                    withdrawal(); 
                    break;  
                case 5:  
                    System.out.println("exit from your account, See you soon...");  
                    break;  
            }  
        }  
        while (ch != 5);  
	}


	public static void main(String[] args) 
	{
		
		SimpleBankApplication sb = new SimpleBankApplication();
		sb.output();
		
	}

}
