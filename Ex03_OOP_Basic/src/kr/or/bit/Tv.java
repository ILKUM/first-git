package kr.or.bit;
/*
 Tv 설계도
 요구사항 정의
 Tv는 채널 정보를 가지고 있다(예를 들어 1~200)
 Tv는 브랜드 이름을 가지고 있다(예를 들면 삼성, 엘지)
 Tv는 채널 전환 기능을 가지고 있다(채널 은 한 채널 씩 이동 가능하다)
 ->채널을 증가 시키는 기능 을 가지고 있다
 ->채널을 감소 시키는 기능을 가지고 있다
 */
public class Tv {
	public String brand; //Tv 브랜드
	public int channel; //Tv 채널
	public void plus() {//Tv 채널 증가
		channel++;
	}
	public void minus() {//Tv 채널 감소
		channel--;
	}
}
