package Encapsulation;

class Nykaa
{
	private int otp=123456;
	public int getOtp()
	{
		return otp;
	}
	public void setOtp(int otp)
	{
		this.otp=otp;
	}
}

public class Customer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nykaa n=new Nykaa();
		System.out.println(n.getOtp());
		n.setOtp(567890);
		System.out.println(n.getOtp());
	}

}
