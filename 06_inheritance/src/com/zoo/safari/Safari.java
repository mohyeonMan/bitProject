package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		zoo.tiger(); // public
//		zoo.lion(); private
//		zoo.elephant(); default
//		zoo.giraffe(); protected

		Safari safari = new Safari();

		safari.tiger(); // public
//		safari.lion(); // private
//		safari.elephant(); // default
		safari.giraffe(); // protected
	}

}
