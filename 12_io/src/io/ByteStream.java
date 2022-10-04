package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
		while( (data = bis.read()) != -1) {
			System.out.print((char)data);
		}
		//65666768131049505152131043454247 
		//1310 = enter // 13 = \n , 10 = \r
		bis.close();
	}

}
