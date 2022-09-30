package nested;

public class AbstractMain implements InterA{
	


	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() { // 메소드 Overring 해서 객체생성돕는다. = 1회성 class.
												// 익명 Inner Class. AbstractMain$1.class
			@Override
			public void setName(String name) {
				this.name = name;
			}
		};
		
		InterA ia = new InterA() { // 익명 Inner Class. AbstractMain$2.class
			@Override
			public void aa() {	
			
			}
			@Override
			public void bb() {
		
			}
		};
		
		AbstractExam ae = new AbstractExam() {}; 
		//빈body 메소드. 오버라이드를 필요로하는 메서드가 없기때문에 하위클래스가 원하는대로 사용할수 있다.
	}
}