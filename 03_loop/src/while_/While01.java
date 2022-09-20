package while_;

public class While01 {

	public static void main(String[] args) {
		
		int a=1;
		while(a<=10) {
			
			System.out.print(a+" ");
			a++;
			
		}//while
		System.out.println();
		
		int b=0;
		while(b<10) {
			b++;
			System.out.print(b+" ");
		}//while
		System.out.println();
		
		int c = 0;
		while(true) {
			c++;
			System.out.print(c+" ");
			if(c>=10) break;
		}//while
		
		
		
	}
}
