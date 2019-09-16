//******* static 함수 (많이 사용한다면 당신은 편하게 사용하세요 new 하지 않고도)
class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {//일반함수
		//1. 일반함수에서 iv 값을 처리(O)
		//2. 일반함수에서 cv 값을 처리(O) >> m함수가 만들어지기 전에 이미 cv가 메모리에 있기 때문에 Today Point (생성시점)
		//static 자원은 일반자원보다 먼저 memory 에 올라간다.
		StaticClass.cv = 1000; //cv=1000;
	}
	static void sm() {//static 함수
		//1. iv 값을 처리(X) why? 생성시점>>static 자원은 일반자원보다 먼저 메모리에 만들어진다
		//static은 static끼리 놀아라( 그러면 error는 없을 것이다
		//함수 입장에서 보면 iv 는 메모리에 없다
		//2. cv 값을 처리(O)
		StaticClass.cv = 2000;
		
	}
}

public class Ex07_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticClass.cv);
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		
		StaticClass sc = new StaticClass();
		sc.m();
		System.out.println(StaticClass.cv);

	}

}
