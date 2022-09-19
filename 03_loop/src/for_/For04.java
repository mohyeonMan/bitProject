package for_;

public class For04 {
	public static void main(String[] args) {
		int a=0;
		char ranAlpha=0;
		for(int i=1;i<=100;i++) {
			ranAlpha = (char)(Math.random()*26+65);
			System.out.print(ranAlpha+" ");
			if(i%10==0) {
				System.out.println();
			}
			if(ranAlpha=='A') {
				++a;
			}
			
		}
		System.out.println();
		System.out.println("알파벳 A가 "+a+"개 발견되었다.");
	}
}
