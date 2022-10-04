package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream2 {
	
	public static void main(String[] args) throws IOException {
		File file = new File("data.txt"); //파일을 객체로 생성.
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));

		int size = (int)file.length(); // long으로 불려온다.
		byte[] b = new byte[size]; //배열생성
		bis.read(b, 0, size); // 배열b의 0부터 size만큼 읽어오기.
		System.out.println(new String(b)); //byte[] -> String  변환
		
		bis.close();
	}

}
