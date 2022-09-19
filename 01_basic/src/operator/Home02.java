package operator;

import java.util.Scanner;

public class Home02 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("알파벳을 입력하세요 : ");
      char a= input.next().charAt(0);
      System.out.println();

      
      String b= a>='A'&&a<='Z'? "소문자로 변환합니다. "+a+" --> "+(char)(a+32)
         :"대문자로 변환합니다. "+a+" --> "+(char)(a-32);
      
      System.out.println(b);
   }

}

