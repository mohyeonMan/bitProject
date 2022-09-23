package class_;

public class SungJukMain {

	public static void main(String[] args) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		
		SungJuk me = new SungJuk();
		me.setData("박지훈", 90, 80, 70);
		me.calc();
		me.showInfo();
		
		SungJuk bb = new SungJuk();
		bb.setData("프로도", 100, 89, 75);
		bb.calc();
		bb.showInfo();
		
		SungJuk cc = new SungJuk();
		cc.setData("죠르디", 75, 80, 48);
		cc.calc();
		cc.showInfo();
	}
}

/*
[문제] 성적처리
클래스명 : SungJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학)
       calc() - 총점, 평균, 학점 계산
      getName()
      getKor()
      getEng()
      getMath()
       getTot()
       getAvg()
       getGrade()

클래스명 : SungJukMain

[실행결과]
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100

 */