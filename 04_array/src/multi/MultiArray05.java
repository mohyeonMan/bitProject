package multi;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("인원 수 입력 : ");
		int cnt = scan.nextInt();
		String[] name = new String[cnt];
		int subjectCnt;
		String[][] subject = new String[cnt][]; 			// 한바퀴돌때마다 열 수를 정해주면된다....
		int[][] jumsu = new int[cnt][];						// 얘도 마찬가지
		double[] avg = new double[cnt];

		// 입력부
		for (int i = 0; i < cnt; i++) {
			System.out.print("이름 입력 : ");
			name[i] = scan.next();
			System.out.print("과목수 입력 : ");
			subjectCnt = scan.nextInt(); 					// 과목수 받아와서
			subject[i] = new String[subjectCnt];			// 과목수 만큼 각 행의 열 생성

			for (int j = 0; j < subjectCnt; j++) { 			// 받은 과목수만큼 과목 입력
				System.out.print("과목명 입력 :");
				subject[i][j] = scan.next();
			}

			jumsu[i] = new int[subjectCnt + 1]; 			// 총점까지 한번에 하려고 열하나 추가
			for (int j = 0; j < subjectCnt; j++) {
				System.out.print(subject[i][j] + " 점수 입력 : ");
				jumsu[i][j] = scan.nextInt();

				jumsu[i][subjectCnt] += jumsu[i][j]; 		// 총점 합산// jumsu.length = subjectCnt
			}
			avg[i] = (double) jumsu[i][subjectCnt] / subjectCnt;
			System.out.println("\n------------------------------------\n");
		}
		
		// 출력부
		for (int i = 0; i < cnt; i++) {
			
			//카테고리
			System.out.print("이름\t");
			for(int j =0;j<subject[i].length;j++) { 			//과목수만큼 과목출력
				System.out.print(subject[i][j] + "\t");
			}
			
			System.out.println("총점\t평균");
			
			
			
			//데이터출력
			System.out.print(name[i] + "\t");

			for (int j = 0; j < jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}
			System.out.println(avg[i]);

			System.out.println();

		}

	}

}

/* 220923 까지 숙제
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어     영어   총점     평균
홍길동    95     100   xxx     xx.xx

이름   국어  영어   과학    총점      평균
이기자   95   100      90        xxx      xx.xx
*/