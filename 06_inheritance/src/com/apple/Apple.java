package com.apple; // src -- com -- apple -- Apple.java

import com.zoo.Zoo;

public class Apple {
	
	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		//Zoo 클래스의 tiger()호출
		
		Zoo zoo =new Zoo();
		zoo.tiger(); // public
//		zoo.lion(); private
//		zoo.elephant(); default
//		zoo.giraffe(); protected
	}
	

}
