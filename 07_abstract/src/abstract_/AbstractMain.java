package abstract_;

public class AbstractMain extends AbstractTest {

	@Override
	public void setName(String name) { // 추상클래스의 하위클래스는 꼭 Override 해줘야한다.
		this.name = name;

	}

	public static void main(String[] args) {
		AbstractTest at = new AbstractMain(); // 추상클래스는 인스턴스를 만들수 없다.

	}

}

/*
 * 하위클래스에게 반드시 오버라이드 할것을 강요하기 위해서 추상클래스 사용.
 */
