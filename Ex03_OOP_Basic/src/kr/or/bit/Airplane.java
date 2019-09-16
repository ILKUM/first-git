package kr.or.bit;
/*
 우리 회사는 비행기를 주문 제작
 
 요구사항
 1.비행기를 생산하고 비행기의 이름과 번호를 부여해야 합니다
 2.비행기가 생산되면 비행기의 이름과 번호 맞게 부여되었는지 확인 하는 작업이 필요합니다(출력정보확인)
 3.공장장은 현재까지 만들어진 비행기의 총대수 (누적)을 확인 할 수 있습니다.
 */
public class Airplane {
/*
	private String airName;
	private int airNum;
	private static int stack; //객체마다 누적되는 자원(객체간 공유자원)
	
	public void mkAirplane(String name, int num) {
		airName = name;
		airNum = num;
		stack++;
		System.out.printf("%d 번 %s 비행기\n" , airNum,airName);
	}
	
	public void howMany() {
		System.out.println(stack);
	}
*/	
	private String airName;
	private int airNum;
	private static int totalNum;
	
	public Airplane(String airName, int airNum ){
		this.airName = airName;
		this.airNum = airNum;
		totalNum ++;
		
	}
	public void showMe() {
		System.out.printf("비행기 이름 : %s, 비행기 번호 : %d\n",airName,airNum);
	}
	public static void checktotal() {
		System.out.println(totalNum);
	}
	
}
