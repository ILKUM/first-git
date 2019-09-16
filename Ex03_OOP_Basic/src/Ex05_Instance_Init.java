class InitTest{
	static int cv =1;
	
	int iv = 1;
	
	static { //static 초기자 (함수) : 변수 초기화 실행시점
		cv =2;
	}
	
	{iv = 3;}//instance 초기자 (함수) : instance 변수 초기화
}
public class Ex05_Instance_Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
