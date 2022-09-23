package class_;

public class SungJukMain02 {

	public static void main(String[] args) {
		int a=10; // 정수형 변수
		int b=10;
		int c=10;

		int[] ar = new int[3];
		//----------------

		SungJuk aa =new SungJuk();
		SungJuk bb =new SungJuk();
		SungJuk cc =new SungJuk();

		SungJuk[]arr = new SungJuk[3]; //클래스 자료형을 이용 객체 배열.
//		arr[0] = new SungJuk();
//		arr[1] = new SungJuk();
//		arr[2] = new SungJuk();

		for(int i=0;i<arr.length;i++) {
			arr[i] = new SungJuk();				// 대체
			arr[i].setData("박", i, i+1, i+2);
			arr[i].calc();
			arr[i].showInfo();
		}
		System.out.println();
	}
}
