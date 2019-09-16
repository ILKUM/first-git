package kr.or.bit;

import java.util.Scanner;

public class Ex09_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("입력");
		Scanner sc = new Scanner(System.in); // ctrl+shift+o -> class의 import 구문 자동 생성

		
		/* if(sc.hasNextInt());{ //의문형 함수(is, has...)>> true, false
		 System.out.println("정수 값이야"); 
		 } 
		 //else {
				System.out.println("다른값인데");
			}
		 
		// sc.hasNextLine()//너 문자열 데이터야? >>true, false

		// 제어문(암기하자)
		// 조건문(if 3가지) (switch(){case .. break;})
		// 반복문 for(반복횟수 명확) , while(true, false) , do~while()
		// 분기문 break;(블럭 ㄴ탈출), continue(아래 구문 skip)

		int count = 0;
		if (count < 1) {
			System.out.println("True입니다");
		}
		// 실행블럭을 생략 가능
		// 자바 ; 세미콜론 문장의 끝 (해석하는 단위)
		if (count < 10)
			System.out.println("True");

		char data = 'A';
		switch (data) {// switch(인자값) 숫자(정수), char, String 가능
		case 'A':
			System.out.println("문자비교");
			break; // 탈출의 범위 (switch 블럭)
		default:
			System.out.println("else 모든 것");
		}

		// 반복문
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// System.out.println(i);
			// 누적값
			sum += i; // sum = sum + i
		}
		System.out.println("sum 1~10: " + sum);

		// for문을 사용해서 1~10까지의 홀수의 합
		// 단 for문 하나만 가지고 해결 (for문 안에 if문 쓰지마세요

		int sum1 = 0;
		for (int i = 1; i <= 10; i += 2 /* i=i+2 */ //{
			//sum1 += i;
		//}
		//System.out.println(sum1);

		//1~100까지의 짝수의 합
		
		/*sum3 = 0;
		
		for (int i = 1; i<=100; i++) {
			if(i%2==0) {
				sum3+=i;
		}
		}
			System.out.println(sum3);
		*/
		
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j<=9 ; j++) {
				//System.out.println("i: " + i + "-" + "j" + j);
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
			
			} System.out.println();
		}
		//key point : break 탈출, continue 스킵
		
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j<=9 ; j++) {
				//System.out.println("i: " + i + "-" + "j" + j);
				if(i == j) {
					break; //안쪽의 for문 탈출
				
				}
				//System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
				System.out.printf("%s", "*");
			} System.out.println();
		}
		
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j<=9 ; j++) {
				//System.out.println("i: " + i + "-" + "j" + j);
				if(i == j)continue; 
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
				
			} System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
