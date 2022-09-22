package multi;

public class MultiArray03 {
	public static void main(String[] args) {
		String[] name = {"홍길동","프로도","죠르디"};
		int[][] score= {{90,95,100,0},{100,89,75,0},{75,80,48,0}};			
		double[]avg = new double[3];
		char[]grade = new char[3];
		
		//총점 계산.
		for(int j=0;j<score.length;j++) {
			for(int i=0;i<score[j].length-1;i++) {
				score[j][score[j].length-1]+=score[j][i];
			}
		}
		
		//평균 계산.
		for(int i =0;i<3;i++) {
			avg[i]=(double)(score[i][3])/(score[i].length-1);			
		}
		
		//학점계산
		for(int i=0;i<3;i++) {
			
		if(avg[i]>=90)
			grade[i]='A';
		else if(avg[i]>=80)
			grade[i]='B';
		else if(avg[i]>=70)
			grade[i]='C';
		else if(avg[i]>=60)
			grade[i]='D';
		else
			grade[i]='F';
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점\n");
		
		for (int j = 0; j < 3; j++) {
			System.out.print(name[j]+"\t");
			for (int i = 0; i < score[j].length; i++) {
				System.out.print(score[j][i] + "\t");
			}
			System.out.printf("%.2f\t",avg[j]);
			System.out.println(grade[j]);
		}

	}
}
/*
 * ----------------------------------------------------
 *  이름 국어 영어 수학 총점 평균 학점
 * ----------------------------------------------------
 *  홍길동 90	95 100
 *  코난 100 89  75 
 *  또치 75 80 48
 *   ----------------------------------------------------
 */