package mostrepeatedquestion;
class Samg1
{
	void call()
	{
		System.out.println("Voice call feature");
	}
	void email()
	{
		System.out.println("Email Properties");
	}
}

class Samg2 extends Samg1{
	void call()
	{
		System.out.println("voice and video call");
	}
	void cam()
	{
		System.out.println("THis is cam");
	}
}
public class Executor {
	public static void main(String[] args) {
		Samg1 ob = new Samg2();
		ob.call();
		ob.email();
		
	}
}
