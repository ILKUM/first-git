package kr.or.bit;

import java.util.Scanner;

public class Signup {
	private String name;//수강신청자 이름
	private String phone;// 수강신청자 휴대폰번호
	private String card;// 내일배움카드
	private boolean possesion;//카드소지여부 미소지: false 소지

	public Signup(String name, String phone) {//수강신청자는 반드시 이름과 휴대폰 번호를 가진다
		this(name, phone, null);
		possesion = false;
	}

	public Signup(String name, String phone, String card) {//수강신청자는 반드시 이름과 휴대폰 번호를 가진다
		this.name = name;
		this.phone = phone;
		this.card = card;
		possesion = true;
	}

	public void signup() {
		if (possesion == true) {
			int i;
			do {
				System.out.println("강의 번호를 선택하시오\n1.java " + "\t2. python\t3.c");
				Scanner sc = new Scanner(System.in);
				i = Integer.parseInt(sc.nextLine());
				if (i == 1) {
					System.out.println("java - 강남(임경균 강사님♥.♥");
					break;
				} else if (i == 2) {
					System.out.println("python - 서초본원");
					break;
				} else if (i == 3) {
					System.out.println("c - 종로");
					break;
				} else {
					System.out.println("다시 입력하세요");
					continue;
				}
			} while (true);
		} else {
			System.out.println("내일배움카드가 등록되지 않아 수강신청을 할 수 없습니다");
		}
	}

	public void showinfo() {
		if(possesion == true) {
		System.out.println("이름 : " + this.name + "\t전화번호 : " + this.phone + "\t카드번호" + this.card);
		}else {
			System.out.println("이름 : " + this.name + "\t전화번호 " + this.phone);
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getCard() {
		return card;
	}

}
