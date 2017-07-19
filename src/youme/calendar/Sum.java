package youme.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		//키보드로 두수의 입력을 받고
		//화면에 두수의 합을 출력한다
		
		int a,b;
		Scanner scan = new Scanner(System.in);
		String s1, s2;
		System.out.println("두수를 입력해주세요");
		s1=scan.next();
		s2=scan.next();						
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);		
		System.out.println(a+"+"+b);	
		System.out.printf("%d와%d의 합은 두수의 합은%d입니다",a,b,a+b);
		scan.close();		
	}

}
