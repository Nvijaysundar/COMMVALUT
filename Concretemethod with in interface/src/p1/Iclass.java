package p1;

public class Iclass implements ITest {

	public void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		Iclass ob = new Iclass();
		ob.m1();
		ob.m2();
		ITest.m3();
	}

}
