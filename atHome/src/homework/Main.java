//백준 문제풀이용----------------------------------------
package homework;


public class Main {

	public static void main(String[] args) {
		int A=5;
		int B=8;
		int C=4;
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
}
