package class_;

public class Compute {
	int x,y,sum,sub,mul;
	double div;
	
	public void calc() {
		sum=x+y;
		sub=x-y;
		mul=x*y;
		div=(double)x/y;
	}	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;
	}
	public int getMul() {
		return mul;
	}
	public double getDiv() {
		return div;
	}
	public void showInfoCalc() {
			System.out.println(
			getX() + "\t" 
			+ getY() + "\t" 
			+ getSum() + "\t"
			+ getSub() + "\t"
			+ getMul() + "\t" 
			+ (String.format("%.2f", getDiv())));
		}
	}
	
	
