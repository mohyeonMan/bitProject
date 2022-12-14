package sungJuk;

import java.util.Scanner;

public class SungJukDTO implements Comparable<SungJukDTO>{
	// 필드 private - 번호 (중복x), 이름 , 국어 영어 수학 총점 평균;
	// 생성자,setter,getter

	// 입력은 insert
	// 출력
	// 수정
	// 번호입력: 잘못된번호입니다 or 번호 이름 국어 영어 수학 총점 평균 출력.
	// 수정할 이름 입력:

	private int num; // 번호
	private String name; // 이름
	private int kor; // 국어
	private int eng; // 영어
	private int mat; // 수학
	private int tot; // 총합
	private double avg;// 평균

	public SungJukDTO() {
		Scanner scan = new Scanner(System.in);
		scan = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		num = scan.nextInt();
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("국어 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		mat = scan.nextInt();
		tot = kor + eng + mat;
		avg = tot / 3;

		System.out.print("\n입력이 완료되었습니다.\n\n");
	}

	public int getNum() {
		return num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void showInfo() {
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int compareTo(SungJukDTO o) {
		if (this.tot > o.tot)
			return -1;
		else if (this.tot < o.tot)
			return 1;
		return 0;
	}

}
