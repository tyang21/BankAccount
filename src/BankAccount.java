/**
 * BankAccount Class
 * @author Tyler Yang
 * Period 7
 */
public class BankAccount 
{
	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount(String n, int num) 
	{
		balance = 0;
		name = n;
		accNum = num;
	}

	public BankAccount(String n, int num, double bal) 
	{
		balance = bal;
		name = n;
		accNum = num;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double ammount) 
	{
		balance = balance + ammount;
	}
	
	public void withdraw(double ammount)
	{
		balance -= ammount;
	}
	public String toString() 
	{
		return "Name: " + name + " Balance: " + balance + " accNum: " + accNum;
	}
}

