package projectPractice;
import java.io.*;
import java.util.*;
public class Oops_En {
	private String accountNumber, name, gmail;
	private float deposit_amount;
	private float balance;
	private float withDraw;

	  public Oops_En(String accountNumber,String name,String gmail,float deposit_amount,float balance,float withDraw)
	  {  this.accountNumber = accountNumber;
	  this.name= name; 
	  this.gmail = gmail;
	  this.balance= balance;
	  this.deposit_amount= deposit_amount;
	  this.withDraw = withDraw;}

	public String getAccountNumber() {return accountNumber;	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getName() {return name;}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getGmail() {return gmail;}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public float getDeposit_amount() {
		return deposit_amount;
	}

	public void setDeposit_amount(float deposit_amount) {
		this.deposit_amount = deposit_amount;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getWithDraw() {
		return withDraw;
	}

	public void setWithDraw(float withDraw) {
		this.withDraw = withDraw;
	}
	 
}

