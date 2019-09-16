class Data{ //클래스 ==타입(큰타입)
	int i;
	
}


public class Ex10_Method_Call {

	public static void main(String[] args) {
		Data d = new Data();
		d.i = 100;
		System.out.println("d.i : " + d.i);
		
		scall(d);//POINT (d라는 변수는 주소값(참조) 어떤 타입을 갖는>Data)
		vcall(d.i);
		System.out.println("d.i : " + d.i);
	}
	
	static void scall(Data data) { // 주소값 전달
		//data 라는 변수는 Data라는 클래스의 주소값을 받으면 돼요
		//Data가 의미하는 것은 주소값
		System.out.println("함수 : " + data.i);
		data.i = 1111;
	}
	
	static void vcall(int x) { //주소가 아닌 값 전달
		System.out.println("before : " + x);
		x= 8888;
		System.out.println("after : " + x);
	}

}
