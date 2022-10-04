package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException { // 데이터를 객체로 묶어서 한번에 입출력
		PersonDTO personDTO = new PersonDTO("박지훈", 28, 177.8);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(personDTO); // java.io.NotSerializableException
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO dto = (PersonDTO) ois.readObject(); // Object형으로 입력받는다. 다운캐스팅이 필요하다.
		System.out.println("이름 = " + dto.getName());
		System.out.println("나이 = " + dto.getAge());
		System.out.println("키 = " + dto.getHeight());
		ois.close();

	}
}
// 자바 수업 끝~~~~~~~~~~~~~~~~~~~~~
