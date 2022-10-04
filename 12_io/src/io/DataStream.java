package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		try {
			// 파일로 출력
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			dos.writeUTF("박지훈");
			dos.writeInt(28);
			dos.writeDouble(177.8);

			dos.close(); // 연결을 끊는 메소드

			// 파일로부터 입력
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			System.out.println("이름 = " + name);
			System.out.println("나이 = " + age);
			System.out.println("키 = " + height);

			dis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		// App -> Buffer -> File

	}
}
