/*
 클래스 == 설계도 == 타입
 
 클래스의 구성요소 : 필드 + 생성자 _ 함수
 *필드>> 고유정보, 상태 정보, 참조정보
 *생성자>> 필드의 초기화를 목적으로 하는 함수 constructor
 *함수 >> 기능 method
 
 클래스 , 필드, 생성자. 함수: 범위 정의하기 위해서 (접근자, 한정자, 수정자)
 >>public, private, default, protected (상속에서)
 
 1.public class Test {}
 
 2.class Test{} >>컴파일러가 내부적으로 default 접근자를 붙인다
 >>>>>>default class Test {}
 >>default 쓰지 않는다...
 >>default 접근자는 : 같은 폴더 안에서는 접근이 가능, 다른 폴더에있으면 서로 접근이 불가
 
 ex> 실습
 1/kr.or.bit.common 폴더 
 CommmonClass >> public class >>
 Ex01_main 과 Common 다른 폴더에 있다
 Exo1_main 클래에서 CommonClass 자원 접근 가능
 
 2. kr.or.bit.common 포더
 Ex01_main 클래스 자원 접근 기능
 why? 접근자()같은 폴더 안에서는 접근 간으, 다른 포더에 있으면서 서비서 접근 불가
 >>default class 언제 사용하는 거지 :같은 폴더 내에서 연습 목적으로
 
 3. 하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있다 (O)
   단 public 은 하나의 class 만 갖는다(나머지는 default)
 */
public class Ex01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			kr.or.bit.common.CommonClass cc = new kr.or.bit.common.CommonClass;
			cc.p_iv = 100; //why ? public int p_iv
			
			Test tt = new Test();
			tt.d_iv = 200; //같은 폴더 (default 접근자 접근 가능)
			tt.p_iv = 300; //public 은 폴더와 상관없이 접근 가능
			//tt.pri_iv 접근불가
		}
	}

}
