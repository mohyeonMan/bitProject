package inheritance;

class AA {
	public int a = 3;

	public void disp() {
		a += 5;
		System.out.println("AA : " + a + " ");
	}
}

//------------------

class BB extends AA {
	public int a = 8; // Overload, Override 는 메소드에만.

	public void disp() {
		this.a += 5;
		System.out.println("BB : " + a + " ");
	}
}

//-------------------

public class TestMain {

	public static void main(String[] args) {

		BB aa = new BB();
		aa.disp(); // BB : 13
		System.out.println("aa : " + aa.a); // =13

		AA bb = new BB(); // 업캐스팅
		bb.disp(); // BB : 13 Override 되어서 하위클래스의 메서드로 연결되었다.
		System.out.println("bb : " + bb.a); // =3 Override 되지 않았다.
		
		BB dd = (BB)bb; //다운캐스팅 
		dd.disp(); 	//18;
		System.out.println("dd : "+dd.a);//=18 
		
		AA cc = new AA();
		cc.disp(); // =8 AA에서는 BB의 메서드를 쓸수없다.
		System.out.println("CC : "+cc.a);//=8
		
		
	}

}
