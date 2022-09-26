package inheritance;

import java.awt.Shape;
import java.util.Scanner;

class ShapeTest {
	protected double area;
	protected Scanner scan = new Scanner(System.in);

	public ShapeTest() {
		System.out.println("ShapeTest 기본생성자");
	}

	public void calcArea() {
		System.out.println("도형을 계산합니다");
	}

	public void dispArea() {
		System.out.println("도형을 출력합니다");
	}
}

//------------------------------------------------------
class SamTest extends ShapeTest {
	protected int base, height;

	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}

	@Override
	public void calcArea() {
		area = base * height / 2.0;
	}

	@Override // 어노테이션
	public void dispArea() {
		System.out.println("삼각형 넓이 = " + area);
	}
}

//------------------------------------------------------
class SaTest extends ShapeTest {
	protected int width, height;

	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.print("가로 : ");
		width = scan.nextInt();
		System.out.print("세로 : ");
		height = scan.nextInt();
	}

	@Override
	public void calcArea() {
		area = width * height;
	}

	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = " + area);
	}

}

//------------------------------------------------------
class SadariTest extends ShapeTest {
	protected int top, bottom, height;

	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("밑변 : ");
		bottom = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}

	@Override
	public void calcArea() {
		area = (top + bottom) * height / 2.0;
	}

	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 = " + area);
	}
}

//------------------------------------------------------
public class ShapeMain {

	public static void main(String[] args) {

//		ShapeTest sam = new SamTest(); // 1:1관계
//		sam.calcArea();
//		sam.dispArea();
//		System.out.println();
//		
//		SaTest sa = new SaTest();
//		sa.calcArea();
//		sa.dispArea();
//		System.out.println();
//		
//		SadariTest sadari = new SadariTest();
//		sadari.calcArea();
//		sadari.dispArea();

		// 결합도 낮추기.
		ShapeTest shape; //

		shape = new SamTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();

		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();

		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		// 상위 클래스는 모든 하위클래스를 참조 할 수 있다.
		// 다운캐스팅을 할때는 업캐스팅이 선행되어야 한다.
	}

}
