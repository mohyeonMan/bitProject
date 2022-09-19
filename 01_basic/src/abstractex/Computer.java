package abstractex;

public abstract class Computer { 
	// 추상클래스는 상속을 하기위한 클래스다. 인스턴스가 추가될수 없다.


	public abstract void display();
	public abstract void typing(); // 추상클래스가 되어야 추상메서드를 가질수있다.
	
	public abstract int add(int x, int y);
	
	public void turnOn() {
		System.out.println("전원을 켭니다~");
		}
	
	public void turnOff() {
}
}
