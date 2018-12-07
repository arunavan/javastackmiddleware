package com.cts;
interface Account
{  void getBalance();
	
}
interface Loan
{
	void getEmi(); //abstract 
	
	
}
class PersonalLoan implements Loan,Account
{
	public void getEmi()
	{
		System.out.println("19999.99");
	}
	public void getBalance()
	{
		
	}
}

/*class HousingLoan extends Loan
{
	void getEmi()
	{
		System.out.println("9999.99");
	}
}*/

public class Abdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Loan a;

a=new PersonalLoan();
a.getEmi();
a=new HousingLoan();
a.getEmi();

	}

}
