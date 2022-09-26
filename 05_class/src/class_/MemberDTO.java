package class_;

import java.util.Scanner;

public class MemberDTO {						//Data Transfer Object
												//데이터 이동 객체
												//=MemberVO (value object) . MemberBean
		private String name;
		private int age;
		private String phone;
		private String address;

		//생성자 만들기	
		public MemberDTO() {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름 입력 : ");
			name=scan.next();
			System.out.print("나이 입력 : ");
			age=scan.nextInt();
			System.out.print("전화번호 입력 : ");
			phone=scan.next();
			System.out.print("주소 입력 : ");
			address=scan.next();
			System.out.println("\n");
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getPhone() {
			return phone;
		}

		public String getAddress() {
			return address;
		}	
		public void showInfo() {
			System.out.println(getName()+"\t"+getAge()+"\t"+getPhone()+"\t"+getAddress());
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return name + "\t" + age + "\t" + phone + "\t" + address;
		}
	}