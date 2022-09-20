package array;

public class Array02 {
	
	public static void main(String[] args) {
	
		String[] arr = {"사자","코끼리","호랑이","카멜레온","기린","원숭이"};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
			System.out.println("문자열의 크기 = "+arr[i].length());
			System.out.println("첫번째 문자 = "+arr[i].charAt(0)); // 문자열에도 인덱스가 있다.
			System.out.println("마지막 문자 = "+arr[i].charAt(arr[i].length()-1));
		}
		for(String a:arr) {
			 
		}
	}
}
