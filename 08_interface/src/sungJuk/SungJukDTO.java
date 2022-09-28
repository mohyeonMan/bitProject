package sungJuk;

import java.util.Scanner;

public class SungJukDTO {
	//필드 private - 번호 (중복x), 이름 , 국어 영어 수학 총점 평균;
	//생성자,setter,getter
	
	//입력은 insert
	//출력
	//수정
	// 번호입력:  잘못된번호입니다 or  번호 이름 국어 영어 수학 총점 평균 출력.
	//수정할 이름 입력:
	
	private int num; // 번호
	private String name; //이름
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private int avg;
	
	public SungJukDTO() {
		Scanner scan= new Scanner(System.in);
		scan = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		num=scan.nextInt();
		System.out.print("이름 입력 : ");
		name=scan.next();	
		System.out.print("국어 입력 : ");
		kor=scan.nextInt();
		System.out.print("영어 입력 : ");
		eng=scan.nextInt();
		System.out.print("수학 입력 : ");
		mat=scan.nextInt();
		
		tot=kor+eng+mat;
		avg=tot/3;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	
}
