package class2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {

		String str = "학원,집,,게임방";

		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 개수 = " + st.countTokens());

		while (st.hasMoreTokens()) {	//토큰이 있으면 true, 없으면 false
			System.out.println(st.nextToken());
		}						// 토큰을 꺼내주고 다음토큰으로 이동
		
System.out.println("------------------------------------");

		String[]ar =str.split(",");
		for(String data : ar) {
			System.out.println(data);
		}
	}
}
//자바 외에는 자주 쓰지않는다.
