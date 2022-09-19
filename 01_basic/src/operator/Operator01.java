package operator;

import java.text.DecimalFormat;

public class Operator01 {

	public static void main(String[] args) {
		
	DecimalFormat exchange = new DecimalFormat();
	
	int money=5738;
	int th = money/1000;
	int hu = (money%1000)/100;
	int te = ((money%1000)%100)/10;
	int on = ((money%1000)%100)%10;
	System.out.println("현금 "+exchange.format(money)+"원");
	System.out.println("천의 자리 : "+th);
	System.out.println("백의 자리 : "+hu);
	System.out.println("십의 자리 : "+te);
	System.out.println("일의 자리 : "+on);		
		
	}

}


