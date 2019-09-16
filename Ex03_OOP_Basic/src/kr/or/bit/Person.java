package kr.or.bit;
//class == 설계도 == Type
//설계도는 구체화(메모리에 올려서)를 통해서 객체로 생성되어야 한다
//구체화 된것을 >>객체, 인스턴스
//설계도가 가지는 기본적인 구성요소 ( 필드 + 생성자 + 함수)

//class Tire {    }
//class Car { Tire tire; }
//class Window {int i;}

public class Person {
	public String name;//instance variable(초기화를 하지 않아도 된다) :default(기본값)을 가지고 있다
	public int age;	//접근자를 public으로 넣어봄
	
	public void print() {//기능, 행위 (method)
		System.out.println(name + " / " + age);
	}
}
