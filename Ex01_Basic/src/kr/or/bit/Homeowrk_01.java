package kr.or.bit;

import java.util.Scanner;

public class Homeowrk_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력하세요");
		int number1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("연산자를 입력하세요");
		String sign = sc.nextLine();
		
		System.out.println("숫자를 입력하세요");
		int number2 = Integer.parseInt(sc.nextLine());
		
		int answer = 0;
		if (sign.equals("+")) {
			answer = number1 + number2;

		} else if (sign.equals("-")) {
			answer = number1 - number2;

		} else if (sign.equals("*")) {
			answer = number1 * number2;

		} else if (sign.equals("/")) {
			answer = number1 / number2;

		} else {
			System.out.println("종료");
			return; //return뒤에 아무것도 안쓰면 메인을 벗어나겠다. 함수의 종결
		}
		System.out.println(answer);
	}
}