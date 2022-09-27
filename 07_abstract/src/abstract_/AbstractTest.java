package abstract_;

public abstract class AbstractTest { 	// POJO (Plain Old Java Object)
	private String name;				// Object 외에 상속이 없는 기본형식.

	public String getName() {	// 메서드구현부
		return name;
	}

	public abstract void setName(String name) ; //추상메서드 abstract class가 아니면 오류.
	
}
