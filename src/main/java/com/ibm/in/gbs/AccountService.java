package com.example;

public interface AccountService {

	public long open(double initialBalance);
	public boolean close(long accountNo);
	public double withdraw(long accountNo,double amount);
	public double deposit(long accountNo,double amount);

	
}
