package variable;


public class Variable05 {

	public static void main(String[] args) {
		int a =10;
		String b = "호랑이";
		int[] ar = new int[10]; // 정수형 배열
		String[] ar2 = new String[10]; // 객체 배열
		
		int j=1; //배열안에 들어갈 숫자
		
		for(int i=0;i<10;i++){
			ar[i]=j++;
			System.out.print(ar[i]);
		}
	}

}
