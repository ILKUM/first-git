import java.util.Scanner;

//점심메뉴 설정하기
//아래 메뉴 중 하나를 선택하세요
//1.백반
//2.짜장면
//3.아무거나
//>4


public class Ex09_do_while_static_menu {
	static Scanner sc = new Scanner(System.in);
	static void inputRecord() {
		System.out.println("성적 데이터 입력");
	}
	static void deleteRecord() {
		System.out.println("성적 데이터 삭제");
	}
	static void sortRecord() {
		System.out.println("성적 데이터 정렬");
	}
	
	static int displayMenu() {
		System.out.println("************");
		System.out.println("***성적관리***");
		System.out.println("1.학생성적 입력하기");
		System.out.println();
		System.out.println("2.학생성적 삭제하기");
		System.out.println();
		System.out.println("3.학생성적 이름순 정렬하기");
		System.out.println();
		System.out.println("4.프로그램 종료");
		System.out.println();
		
		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine());
				if(menu>=1 && menu<=4) {
					break; //while 탈출
				}
				else{
					throw new Exception("메뉴선택 문제 발생");
				}
			}catch (Exception e) {
				System.out.println("메뉴 선택 문제");
				System.out.println("메뉴 1~4번까지 선택");
			}
			}
		while(true); //for(;;){}
		return menu;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			switch(displayMenu()) {
			case 1: inputRecord();
				break;
			case 2: deleteRecord();
				break;
			case 3: sortRecord();
				break;
			case 4: System.out.println("프로그램 종료하비낟");
				//return;
				System.exit(0);
			}
		}
	}

}
