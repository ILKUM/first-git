//연산자
public class Ex05_Operation {
		public static void main(String[] args) {
			int result = 100/100;
			System.out.println(result);
			
			
			result = 13/2; //몫
			System.out.println(result);
			
			//나머지를 구하는 연산자 (%)
			result = 13%2;//나머지 구하는 것
			System.out.println(result);
		
			//증가, 감소(증가감 연산자 :ㅣ ++, --) 1씩 증가, 1씩 감소
			int i = 10;
			//i = i+1;
			++i;//전치증가
			System.out.println("전치 i : " + i);
			i++;//후치증가
			System.out.println("후치 i :" + i);
			//변수 혼자 : 전치, 후치 도일
			
			//POINT : 전치 후치는 다른 연산자와 결합(성질_
			int i2 = 5;
			int j2 = 4;
			int result2 = i2 + ++j2;
			System.out.println("result2 = " + result2 + "j2 = " +j2);
			//result2 : 10, i2 = 5, j2 = 5
			result2 = i2 + j2++;
			System.out.println("result2 = " + result2 + "j2 = " + j2);
			
			//POINT
			//자바의 연산 규칙
			//정수의 모든 [연산]은 int [변환] 후 처리
			//byte + byte => 컴파일러가 int + int
			byte b = 100; // -128~127 
			byte c = 1;
			byte d = (byte)(b + c);
			//1. int d = b+c;<<이게 제일 무난함
			//2. byte d = (int)(b+C); 데이터 손실이 올수도 있음.
			
			//byte + short => 컴파일러 int + int
			//char + char => 컴파일러 int + int
			//연산처리시
			//point : 연산에서 int 보다 작은 타입은 int 변환(long제어)
			//연산(byte, char, short -> int) 바꾸어서 처리
			
			//규칙 피연산자 중 표현 범위가 큰 타입으로 자동 형 변환
			//byte + short -> int + int >>int
			//char + ont -> int + int >>int

			//int + lont -> long + long >>long
			
			//정수 + 실수
			long ll = 10000000000l;
			float ff = 1.2f;
			float fresult = ll + ff; //승자느 실수
			System.out.println("fresult : "+ fresult);
			
			float num2 = 10.45f;
			int num3 = 20;
			//num2 + num3 
			//받는쪽이 큰타입이기때문에 문제될게 없다.: float + int >> float + float
			//float result5 = num2 + num3;
			System.out.println(result);
		
			int result5 = (int)(num2 + num3);
			System.out.println(result5); //정수부만
			
			char c2 = '!';
			char c3 = '!';//char 정수타입 내부저ㄱ으로는 정수값을 가지고있다.
			
			//c2+c3결관ㄴ...?
			//char results6= c2 + c3; int + int안됩니당.
			int result6 = c2 +c3;
			System.out.println("result6 : " + result6);
		  //더한값을 문자로 출력 : 십진수 66을 아스키코드표 문자
			System.out.println((char)result6);
			
			//제어문
			//중소기업 시험문제(구구단 출력) >> 별찍기]
			//2~9
			//2>> 1~9
			//2>> ~10
			
			//main 함수 안에 있는 lcak variable
			
			int sum =0;
			for(int j = 1 ; j<= 100; j++) {
				//System.out.println("j: "+ j);
				if (j%2 == 0) {
					System.out.println("j : "+ j);
					
				}
			}
			for(int j = 1 ; j<= 100; j++) {
				//System.out.println("j: "+ j);
				if (j%2 == 0) { // == true, false 
					//System.out.println("j : "+ j);
			   sum += j; //sum = sum +j;
			  				}
			}
			
			
				   System.out.println(sum);
			
			
			// == 연산자(값을 비교하는 연산자)
			if(10 == 10.0f) {
				System.out.println("True");
			} else {
				System.out.println("false");
				
			}
			
			
			//! 부정연산자
			if ('A'!= 65) { //같지 않니?
				System.out.println("어 같지않아...");
			}else {
				System.out.println("어 같은 값이야");
				
				//암기하자 (point)
				//삼항연산자 
				//if문 for문 while문 break문 continue문 외우기!.
				int p = 10;
				int k = -10;
				int result8 = (p == k)? p : k; 
				//조건이 거짓이면 k값을 취하고
				//조건이 참이면 p값을 취한다.
				System.out.println("result8:" + result8);
				//삼항연산자 if문과 호환가능
				//if 문으로 바꿔보기
				
			}
			
			
			int p = 10;
			int k = -10;
			int result1 = 0;		
			if ( p == k) {
				result1 = p;
				
			}else {
				
					result1 = k;
					
			}
			System.out.println("result1=" + result1);
			
			
			//진리표
			/*
			 (논리연산)
			 0 : false
			 1 : true
			 		OR 	AND
			  0 0 	0	0	
			  0 1	1	0
			  1 0	1	0
			  1 1	1	1
			  
			  SQL문(oracle)
			  select * (가지고와 전체)
			  from emp (emp로부터)
			  where empno = 1000 and sal>2000 (조건은 empno가 1000 그리고 sal >2000인거)
			  			  
			  select * (가지고와 전체)
			  from emp (emp로부터)
			  where empno = 1000 or sal>2000 (조건은 empno가 1000 또는 sal >2000인거)
			  
			  연산자
			  | or 연산자
			  & and 연산자
			  0과 1로 변환해서 bit 연산
			  
			  || 논리연산
			  && 비트연산
			 
			 */
			
			int x = 3;
			int y = 5;
			System.out.println("x|y: " + (x|y));
			//십진수 3을 -> 2진수 (0과 1로만 이루어진 값으로 바꾸어서)
			//2 0승, 2 1승 
			// 128 64 32 16 8 4 2 1
			//				0 0 1 1 >> 3 2진수값
		//
		//					0 1 0 1	>> 5 2진수값	
		//OR				0 1 1 1	>> 4+2+1 > 7
		//AND 				0 0 0 1 >> 1	\
			System.out.println("x&y: " + (x&y));
		
		
		
			
		
		
			
		}
}


