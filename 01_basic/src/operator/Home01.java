package operator;

import java.util.Random;

public class Home01 {
	public static void main(String[] args) {
		

	Random ran1 = new Random();
	Random ran2 = new Random();
	
	
	
	int dice1 = ran1.nextInt(6)+1;
	int dice2 = ran2.nextInt(6)+1;
	int win = Math.max(dice1,dice2);
	

	System.out.println("주사위 1p -> "+dice1);
	System.out.println("주사위 2p -> "+dice2);
	System.out.println();
	
	String winner = dice1>dice2? "주사위 1p가 "+win+"으로 승리!"
			:dice2>dice1?"주사위 2p가 "+win+"으로 승리!"
					:"1p와 2p의 주사위가 같습니다";
	System.out.println(winner);
	System.out.println("합계 = "+(dice1+dice2));
	
   }
}
