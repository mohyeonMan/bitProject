package multi;

import java.util.Scanner;

public class MultiArray05 {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int cnt;//인원수
		int subjectCnt;//과목수
		int jumsu;//점수
		
		
		// 입력부
		System.out.print("인원수 : "); // 인원수 입력
		cnt=scan.nextInt();
		String[] name= new String[cnt];
		System.out.println();
		
		
		for(int i=0;i<name.length;i++) { //  인적사항 받아오기 i - 인원수만큼 반복
			
			System.out.print("이름입력 : ");
			name[i]=scan.next();
			System.out.print("과목수 입력 : ");
			subjectCnt=scan.nextInt();
			String[][]subject = new String[name.length][subjectCnt];//과목명
			for(int j=0;j<subjectCnt;j++) {
				System.out.print("과목명 입력");
				subject[name.length][j]=scan.next();
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		// 출력부
		
		
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