package class_;

class Person {

	private String name;	// 필드, 멤버변수.
	private int age;		//이미 초기화가 되어있다. 0 or Null

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() { // 자바는 메서드 하나당 return 하나.
		return name;
	}

	public int getAge() {
		return age;
	}
	
	//////////
	public void setData(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setData() {} // 멤버변수가 없을때 NULL을 띄울수있다.
	//////////
	
	public Person(String name,int age) { 
		//생성자 생성, 디폴트생성자는 사라진다. 
		this.name=name;
		this.age=age;
	}
	public Person() {}
		//디폴트생성자는 추가로 만들어줄수있다.
}

//------------------------------------------------------
public class PersonMain {

	public static void main(String[] args) {

		Person aa; // 클래스형 변수 , 객체
		aa = new Person(); // 생성자
		// 클래스를 private 해서 비가시화 했다.
		// public 메서드를 이용해서 입력 호출.
		aa.setName("모현맨"); // aa.name = "모현맨";
		aa.setAge(28); // aa.age = 28;
		System.out.println("내 이름은 " + aa.getName() + ", 나이는 " + aa.getAge() + "살 이다\n");
		
		
		
		Person bb = new Person();
		bb.setData("엉덩이", 3);
		System.out.println(bb.getName()+bb.getAge()+"\n");
		
		//생성자 활용 예
		Person cc= new Person("뿡리맨",10);
		System.out.println(cc.getName()+cc.getAge()+"\n");

	}
}
