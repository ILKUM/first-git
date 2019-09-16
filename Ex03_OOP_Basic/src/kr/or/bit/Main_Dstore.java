package kr.or.bit;

import java.util.Scanner;

public class Main_Dstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number;
		Dstore d1 = new Dstore("나이키", 1);
		Dstore d2 = new Dstore("아디다스", 2);
		Dstore d3 = new Dstore("리바이스", 3);
		do {
			System.out.println("정보를 조회하고 싶은 층 수를 입력하시오(1,2,3)\n 종료하고 싶다면 \"종료\"를 입력해주세요");
			Scanner sc = new Scanner(System.in);
			number = sc.nextLine();
			
			if(number.equals("1")) {
				System.out.println("1층 - 나이키");
				continue;
			}else if(number.equals("2")){
				System.out.println("2층 - 아디다스");
				
			}else if(number.equals("3")) {
				System.out.println("3층 - 리바이스");
			}else if(number.equals("종료") ){
				System.out.println("종료합니다");
				System.exit(0);
			}else {
				System.out.println("입력오류");
			}
			
		}while(true);
				
	}

}
