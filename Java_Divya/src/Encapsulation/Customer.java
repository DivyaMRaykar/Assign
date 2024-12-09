package Encapsulation;

class HDFC_Bank
{
	private int atm_pin=1234;
	public int getAtm()
	{
		return atm_pin;
	}
	public void setAtm(int atm_pin)
	{
		this.atm_pin=atm_pin;
	}
}

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC_Bank h=new HDFC_Bank();
		System.out.println(h.getAtm());
		h.setAtm(5678);
		System.out.println(h.getAtm());
	}

}
