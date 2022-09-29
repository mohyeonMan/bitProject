package collection;

import java.util.ArrayList;

public class PersonMain {

	public void init(ArrayList<PersonDTO> person) {
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("죠르디", 30);
		person.add(aa);
		person.add(bb);
		person.add(cc);
	}

	public static void main(String[] args) {
		ArrayList<PersonDTO> person = new ArrayList<PersonDTO>();
		PersonMain personMain = new PersonMain();
		personMain.init(person);
		for (int i = 0; i < person.size(); i++) {
			System.out.println(person.get(i)); // toString Overriding
		}
	}

}
