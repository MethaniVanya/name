package dto;

public class Accounts {
 
	int acno;
	String name;
	String acktype;
	float balance;
	public  Accounts(int acno,String name,String acktype,float balance)
	{
		this.acno=acno;
		this.name=name;
		this.acktype=acktype;
		this.balance=balance;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcktype() {
		return acktype;
	}
	public void setAcktype(String acktype) {
		this.acktype = acktype;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
}