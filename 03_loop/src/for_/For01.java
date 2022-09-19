package for_;

public class For01 {
	public static void main(String[] args) {
		
		for(int i=0; i<10;i++) {
			System.out.println("Hello Java "+i);
		}
		
		System.out.println();
		
		for(int j=10;j>0;j--) {
			System.out.println("Hello Java " + j);
		}
		
		System.out.println();
		
		for(int i='A';i<='Z';i++) {
			System.out.print((char)(i)+" ");			
		}
	}	
}
