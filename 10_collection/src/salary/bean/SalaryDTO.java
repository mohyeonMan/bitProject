package salary.bean;

import java.text.DecimalFormat;

public class SalaryDTO implements Comparable<SalaryDTO> {
	private static int serial=1000;
	private int num;
	private String name;
	private String grade;
	private int normal;
	private int extra;
	private double tax;
	private double salary;
	
	public SalaryDTO(String name, String grade, int normal, int extra) { // 생성자
		super();
		this.name = name;
		this.grade = grade;
		this.normal = normal;
		this.extra = extra;
		this.num=++serial;
	}
	
	public void calc() {
		if((normal+extra)<=2000000)
			tax=0.01;
		else if((normal+extra)<=4000000)
			tax=0.02;
		else tax=0.03;
		
		salary=normal+extra -(normal+extra)*tax;
	}

	public static int getSerial() {
		return serial;
	}

	public static void setSerial(int serial) {
		SalaryDTO.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getNormal() {
		return normal;
	}

	public void setNormal(int normal) {
		this.normal = normal;
	}

	public int getExtra() {
		return extra;
	}

	public void setExtra(int extra) {
		this.extra = extra;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void showInfo() {
		System.out.println(num+"\t"+name+"\t"+grade+"\t"+normal+"\t"+extra+"\t"+tax+"\t"+(int)salary);
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public int compareTo(SalaryDTO o) {
		if (this.num > o.num)
			return -1;
		else if (this.num < o.num)
			return 1;
		return 0;
	}
	
	
	
}
