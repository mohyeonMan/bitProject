package interface_;

public interface InterA { //상수와 추상클래스만 올수있다.
	
	public static final String NAME="박지훈"; //상수
	public int AGE =25; // static final 생략 가능.
	
	public abstract void aa();
	public void bb(); //abstract 생략 가능.
}
