package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;



public class SungJukService {
	//menu() 생성.
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	public void menu() {
		while(true) {
			int a;
			Scanner scan = new Scanner(System.in);
				System.out.println(
					"************************\n"
				+		"\t1. insert\n"
				+		"\t2. list\n"
				+		"\t3. update\n"
				+		"\t4. 끝내기\n"
				+	"************************");

				System.out.print("\t\t메뉴 : ");
				a = scan.nextInt();

				
				if (a == 4)
					break;
				if( a== 1) {
					SungJukInsert sungJukInsert = new SungJukInsert();
					sungJukInsert.execute(list);
				}
				if(a==2) {
					
				}

			}

		}
	}
