package class2;

class StaticTest{
	private int a;
	private static int b;
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a="+a+"/t b="+b);
	}
}
//----------------------
public class StaticMain {

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		st1.calc();
		st1.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc(); 
		st3.disp();
		System.out.println();
	}

}
