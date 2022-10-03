package object;

class Student{
	int studentID;
	String studentName;
	
	
	Student(int studentID,String studentName){
		this.studentID=studentID;
		this.studentName=studentName;
	}


	@Override
	public boolean equals(Object obj) { // equals Override 
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID== std.studentID)
				return true;
		}
		return false;
	}
	
	public int hashCode() { //equals를 재정의할때 썻던 멤버변수들로 재정의하면 쉽다.
		return studentID;
	}
	
	
}

public class EqualsTest {
	
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true
		
		Student std1 = new Student(10001,"박지훈");
		Student std2 = new Student(10001,"박지훈");
		
		System.out.println(std1.equals(std2));  // true
		// equals Override 통해 주소가 다르지만 같은 학생으로 취급
		
		System.out.println(std1.hashCode()); // 인스턴스 주소값 10진수로 반환
		System.out.println(std2.hashCode());
		
		System.out.println(str1.hashCode()==str2.hashCode()); //true.
		//이미 Override 되어있다.
		System.out.println(System.identityHashCode(str1)); //진짜 주소를 반환하는 메소드
		System.out.println(System.identityHashCode(str2));
		//논리적으로 동일함을 위해 equals 재정의 했다면 hashcode도 재정의 해야한다.
		
		
	}

}
