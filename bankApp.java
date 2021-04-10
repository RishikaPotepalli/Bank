package bank;
import java.util.Scanner;
public class bankApp {
	public static void main(String[] args) {
        BankAccount ob1 = new BankAccount();
		
		ob1.setAccountHolderName("Joey");
		ob1.setBalance(3000);
		ob1.setStatus(true);
		ob1.doDeposit(1000);
		ob1.doWithdrawal(300);
		
		BankAccount ob2 = new BankAccount();
		ob2.setAccountHolderName("Rachel");
		ob2.setBalance(15000);
		ob2.setStatus(true);
		ob2.doDeposit(300);
		ob2.doWithdrawal(1000);
		System.out.println("Balance of "+ ob1.getAccountHolderName()+"= "+ob1.getBalance());
		System.out.println("Status="+ob1.isStatus());
		System.out.println("Balance of "+ ob2.getAccountHolderName()+"= "+ob2.getBalance());
		System.out.println("Status="+ob2.isStatus());
		
	}



}
	