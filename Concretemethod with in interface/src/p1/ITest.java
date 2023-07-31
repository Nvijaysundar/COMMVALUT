package p1;
public interface ITest {
	abstract void m1();
	default void m2() {
		System.out.println("This is m2 method");
		this.m5();
		ITest.m4();
	}
	static void m3()
	{
		System.out.println("This is m3 method");
		
	}
	private static void m4() {
		System.out.println("This is m4");
	}
	private void m5() {
		System.out.println("This is m5");
	}
}
