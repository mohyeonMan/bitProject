package operator;

public class Boxing {
	
	public static void main(String[] args) {
		int a = 25;
		double b = (double)a/3;
		
		String c = "25";
//		int d = (int)c; // 형변환 불가
		int d = Integer.parseInt(c); // 클래스형을 기본형으로 형변환
		
		
		int e = 5;
		Integer f = e;//AutoBoxing - JDK 5.0 부터
		Integer ㅎ = new Integer(e); // JDK 5.0 이전
			
		Integer h= 5;
		int i = h;//unAutoBoxing
		int j = h.intValue(); //JDK 5.0 이전
		
		
		
		
				
		
	}

}
