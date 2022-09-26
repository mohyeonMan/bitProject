package inheritance;

public class Super {

	protected double weight, height; // protected : 상속관계끼리만 사용가능.

	public Super() {
		System.out.println("Super 기본생성자");
	} // 기본생성자가 없으면 Sub에 에러난다. SuperClass에 기본생성자가 사라졌기 때문.

	public Super(double weight, double height) {
		System.out.println("Super constructor");
		this.weight = weight;
		this.height = height;
	}

	public void disp() {
		System.out.println("몸무게 : " + weight);
		System.out.println("키 : " + height);
	}

}
