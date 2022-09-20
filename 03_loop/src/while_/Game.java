package while_;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
	while(true) {
		
		Random ran1= new Random();
		int com = ran1.nextInt(100);
		System.out.println(com);
		System.out.println("1부터 100까지 Up&Down");
		Scanner scan = new Scanner(System.in);
		int i =1;
		for(; ; i++) {
			System.out.print(i+"번째 : ");
			int user = scan.nextInt();

			if(user==com) {
				break;
			}
			else if (user<com) {
				System.out.println("Up");
			}
			else if(user>com) {
				System.out.println("Down");
			}
		}//for
		System.out.println();
		System.out.println(i+"번째에 정답을 맞췄네요.");
		System.out.printf("  다시하기(Y/N) : ");
		String yn =scan.next();
		if(yn.equals("N")||yn.equals("n")) { // 입력받은 N과 주소값이 다르기때문에
			break;
		}
	}//while
	System.out.println("\n*****게임 종료*****");
	}
}
