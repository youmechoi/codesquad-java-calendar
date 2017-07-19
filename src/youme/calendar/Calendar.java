package youme.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonths(int month) { // int로 입력받아서 int로 되돌려준다는 메소드
		return MAX_DAYS[month - 1];
		// switch (month) {
		// case 2:
		// return 28;
		// default:
		// return 31;
		// } switch문을 이용한 출력방법

		// if (month == 1) {
		// return 31;
		// } else if (month == 2) {
		// return 28;
		// } else {
		// return 31;
		// }.. 이런식으로 계속 if문으로 써서 달의 최대일수를 출력할 수도 있음.
	}

	public void printSampleCalendar() { // 입력도 출력도 없는 메소드
		System.out.println("Hello, Calendar");
		System.out.println("일   월    화   수  목   금   토");
		System.out.println("--------------------");
		System.out.println("1  2   3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String args[]) {

		// 숫자를 입력받아 해당하는 달의 최대일수를 출력하는 프로그램
		String PROMPT = "cal> ";
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();

		// System.out.println("원하는 반복 횟수를 입력하세요");

		// int repeat;
		// 횟수를 모를때는 while문, 횟수를 잘 알떄는 for문을 사용하는게 좋다

		// for(int i=0; i<repeat; i++){ //이거는 그냥 repeat번 반복하는 반복문 for문이다

		while (true) {
			System.out.println("원하는 달을 입력해주세요. 예)1월~12월");
			System.out.print(PROMPT);
			int month = scan.nextInt();
			if(month == -1){
				break;
			}
			if(month > 12){
				continue; //continue를 만나면 루프의 처음으로 돌아간다
			} 
			System.out.printf("%d월은 %d일 까지 있습니다.\n", month, cal.getMaxDaysOfMonths(month));
		}
		System.out.println("bye~*");
		scan.close();
	}

}
