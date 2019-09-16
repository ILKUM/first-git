/*
 객체지향 언어
 1. 상속 (재사용성을 높임)
 2. 캡슐화 (private) -> 함수(read, write): 간접할당(자원보호) -> 캡슐화된 member field
 	read(get) , write (set) 전용함수 -> setter ,getter -> 약속 getEmpno, setEname
 3. 다형성
  
  [다형성 이라하는 녀석의 한 부분]
  
  [method overloading]
 하나의 이름으로 여러가지 기능을 하는 함수
 사용: System.out.println();
 특징: 오버로딩은 성능 향상에 도움을 준다
 	 why> 편하게 사용할려고 >> 개발자
 	  고민(설계도 어떤 점을 생각하면) >> 함수의 활용이 많은 경우 (다양한 parameter 사용)
 	 ^^static 함수 why...
 문법 : 함수의 이름은 같고 parameter 의 개수와 티입을 달리하는 방법
 1. 함수의 이름은 같아야 한다
 2.[parameter] 개수 또는 [Type] 은 달라양 한다
 3. return type은 overloading 판단기준이 아니다
 4. parameter의 순서가 다름을 인정한다 
 */
class Human{//설계도 ==타입 사용방법>new 를 통한 객체 생성
	String name;
	int age;
}
class OverTest{
	void add(Human h) { //개수는 같지만 Type 트릴면 인정
		h.name = "홍길동";				//Human 객체의 주소값을 받을 수 있다
		h.age = 100;
		System.out.println(h);
	}
	
	int add(int i) {
		return 100+i;
	}
	/* 충돌
	int add(int s) {
		return 200+s;
	}
	*/
	String add(String s) {
		return "hello" + s;
	}
	int add(int i , int j) {
		return i+j;
	}
	
	void add(int i, String s) {
		System.out.println("오버로딩" + i + "/" + s);
	}
	
	void add(String s , int i) {
		System.out.println("parameter 순서가 다름을 인정");
	}
	
	//배열에 있는 Ex05_Array_Object 마치고 나서
	//Array ...배열은 객체다 >> 배열이 갖고 있는 것은 주소값 (int[] 참조하는 주소값)
	int[] add(int[] param) {//param 변수가 받는 값은 무엇일까요?
		int [] target = new int[param.length];
		for(int i = 0; i <param.length; i++) {
			target[i] = param[i]+1;
		}
		return target;
	}
	
	int[] add(int[] so, int[] so2) {
		int[] target2 = new int[so.length];
		for(int i = 0; i<so.length; i++) {
			target2[i] = so[i]*so2[i];
		}
		return target2;
	}
	
	
}


public class Ex11_Method_overloading {
	public static void main(String[] args){
	OverTest ot = new OverTest();
	int result = ot.add(100);
	System.out.println(result);
	String str = ot.add("홍길동");
	System.out.println(str);
	
	//1 ok
	Human m = new Human();
	System.out.println("m의 주소값 :" + m);
	ot.add(m);
	
	//2 
	ot.add(new Human()); //heap 에서 todtjdehls wnth qkfh wjsekf
	
	//Array parameter 로 또는 return Type
	int [] source = {10,20,30,40,50};
	
	int[] target = ot.add(source);
	System.out.println(source == target);
	//개선된 for문
	for(int value : target) {
		System.out.println(value);
	}
	
	int[] so = {10,20,30};
	int[] ta = {11,21,41};
	int[] ta2 = ot.add(so, ta);
	for(int value : ta2) {
		System.out.println(value);
	}
	
	
	
	
	
	
	
	
	
	}	
}
