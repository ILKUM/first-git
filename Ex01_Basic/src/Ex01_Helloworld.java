import kr.or.bit.Emp;

public class Ex01_Helloworld {
//extends object 디폴트값이라 표시가 안됨
//hello world 안에 object가 속해 있따.
	public static void main(String[] args) {
		//위에꺼 이름 메인메소드
		//System.out.println("hello world");
		
		//kr.or.bit.Emp emp = new/*연산자*/ kr.or.bit.Emp(); //emp라는 설계도를 보고 똑같이 만들어라 라는뜻이 new
		//emp.data = 10000; 이건 직접할당
		//재사용성이 중요하당 객체지향에서
		//emp.setData(10000); //이건 간접할당
		//System.out.println(emp.getData());
		Emp emp = new Emp(); //사원 한명을 생성합니다
		emp.empno = 7777;
		emp.ename = "홍길동";
		emp.job = "IT";
		
		String str = emp.getEmpInfo();
		System.out.println(str);
		
		Emp emp2 = new Emp();
		emp2.empno = 8888;
		emp2.ename = "아무개";
		emp2.job = "sales";
	
		String str2 = emp2.getEmpInfo();
		System.out.println(str2);
		
		}

}
