package com.zoo;

public class Zoo2 {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		zoo.tiger(); // public
//		zoo.lion(); //private
		zoo.elephant(); // default
		zoo.giraffe(); // protected
	}
}
