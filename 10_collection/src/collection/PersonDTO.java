package collection;

public class PersonDTO {
	private String name;
	private int age;

//-----------------------------
	public PersonDTO() { //컨트롤+스페이스 디폴트생성자 자동으로 잡아준다
		// TODO Auto-generated constructor stub
	}
	public PersonDTO(String name, int age) {

		this.name = name;
		this.age = age;
	}

//--------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름 + "+name+"\t나이 = "+age;
	}
	

}
