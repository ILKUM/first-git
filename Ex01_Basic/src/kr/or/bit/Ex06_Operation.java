package kr.or.bit;

public class Ex06_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// 대입연산자 (+=, -=, *=, ) 습관적으로
		sum += 1; // sum = sum + 1;
		sum -= 1; // sum = sum - 1;
		System.out.println("sum: " + sum);

		// 간단한 학점 계산기
		// 학점 A+, A- , B+, B- (score)
		// 점수 : 94 점
		// 95점이상 A+
		// 그외 A-

		// 90점 이상이면 A 인데... 95 A+, 93 A-

		int score = 55;
		String grade = ""; // 문자열 초기화
		System.out.println("당신의 점수는 : " + score);

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {// grade = grade"+"
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {// grade = grade+"+"
				grade += "+";
			} else {
				grade += "-";
			}

		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {// grade = grade+"+"
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("당신의 학점은 : " + grade + "입니다");

		// syso + ctrll+space 자동완성
		// 코드정렬하기 ctrl+A 블록선택 ctrl+shift+F 자동정렬

		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100입니다");
			break;
		case 90:
			System.out.println("90입니다");
			break;
		case 80:
			System.out.println("80입니다");
			break;
		default:
			System.out.println("default");
		}// break는 강제사항이 아닙니다(필요에 따라서)
			// case 조건 만족하는 이후부터
		data = 80;
		switch (data) {
		case 100:
			System.out.println("100입니다");

		case 90:
			System.out.println("90입니다");

		case 80:
			System.out.println("80입니다");

		default:
			System.out.println("default");
		}
		int month = 2;
		String res = "";
		switch (month) {
		case 1:
			System.out.println("1");
		case 3:
			System.out.println("3");
		case 5:
			System.out.println("5");
		case 7:
			System.out.println("7");
		case 8:
			System.out.println("8");
		case 10:
			System.out.println("10");
		case 12:
			res = "31";
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			res = "30";
			break;
		case 2:
			res = "29";
			break;

		default:
			res = "달이 아닙니다";
		}
		System.out.println(month + "월은" + res + "까지입니다");

		// 난수(랜덤값 : 임의의 추출값)
		// java.lang.Math (Math 클래스)
		// default > java.lang.Math
		// java 페이지에서 default 열어놓은 폴더가 있다.(java.lang) >> import java.lang.*
		// 페이지 상단(원칙) import java.lang.Math; 사용하겠습니다

		// Math.lang()
		// static Random() 객체 생성 없이도 사용가능 (static 함수는 자주 사용하니까)
		// Returns a double value with a positive sugbm greater thatn or equal to 0.0
		// less than 1.0
		// 결과 : 0.0 <= random <1.0

		System.out.println("Math.random(): " + Math.random());
		System.out.println("Math.random() * 10:" + Math.random()*10);
		//0~9까지의 정수값만
		System.out.println("Math.random() * 10:" + (int)(Math.random()*10));
		//1~10
		System.out.println("Math.random() * 10:" + ((int)(Math.random()*10) +1));

		/*
		 우리는 백화점 경품 시스템을 만들려고 한다
		 경품시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
		 경품 추첨시 1000 점수가 나오면 경품으로 
		 TV, NoteBook, 냉장고 , 한우세트, 휴지
		 
		 경품 추첨시 900 점수가 나오면 경품으로 
		 NoteBook, 냉장고 , 한우세트, 휴지
		 
		 경품 추첨시 800 점수가 나오면 경품으로 
		 냉장고 , 한우세트, 휴지
		 
		 경품 추첨시 700 점수가 나오면 경품으로 
		 한우세트, 휴지
		 
		 경품 추첨시 600 점수가 나오면 경품으로 
		 휴지
		 
		 그외 점수는 100~500까지는 칫솔
		 추첨시스템의 점수범위는 100~100까지로 한정 
		
		 사용자가 경품시스ㅔㅁ을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어있다
		 */
		
		
		switch((int)(Math.random()*10)*100) { 
		
		case 1000: System.out.println("당신의 점수는" + ((int)(Math.random()*10)*100) +"점 입니다TV, NoteBook, 냉장고 , 한우세트, 휴지");
		break;
		case 900: System.out.println("당신의 점수는" + ((int)(Math.random()*10)*100) +"NoteBook, 냉장고 , 한우세트, 휴지");
		break;
		case 800: System.out.println("당신의 점수는" + ((int)(Math.random()*10)*100) +"냉장고 , 한우세트, 휴지");
		break;
		case 700: System.out.println("당신의 점수는" + ((int)(Math.random()*10)*100) +"한우세트, 휴지");
		break;
		case 600: System.out.println( "당신의 점수는" + ((int)(Math.random()*10)*100) +"휴지");
		break;
		default : System.out.println("당신의 점수는" + ((int)(Math.random()*10)*100) +"칫솔");
		break;
		}
		
}

}
