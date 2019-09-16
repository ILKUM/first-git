import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (char c = 65; c <= 90; c++) {
			System.out.print(c);
		}

		System.out.println();
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + " ");
			}
		}

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}

		}
		System.out.println(sum);

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				int sum1 = i + j;
				if (sum1 == 6) {
					System.out.printf("[%d] [%d]\n", i, j);
				}
			}

		}
		System.out.println("가위, 바위, 보를 입력하시오");
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		int r = 0;
		if(i.equals("가위")) { r = 1;
			
		} else if(i.equals("바위")) {r = 2;
		
		} else if(i.equals("보")) {r = 3;
		
		} else {r = 4;
		
		} 
		
		
		int com = (int)((Math.random()*3)+1);
		if(com == 1) { System.out.println("컴퓨터: 가위");
		
		} else if(com==2) {System.out.println("컴퓨터: 바위");
		
		} else {System.out.println("컴퓨터: 보");
		
		} 

		if (r == com) {
			System.out.println("비겼습니다");
		} else if ((r == 1 && com == 3) || (r == 2 && com == 1) || (r == 3 && com == 2)) {
			System.out.println("이겼습니다");
		} else if ((r == 1 && com == 2) || (r == 2 && com == 3) || (r == 3 && com == 1)) {
			System.out.println("졌습니다");
		} else {
			System.out.println("Error");
		}
/*
		int i = 1;
		int sum3 = 0;
		while (i <= 99) {
			sum3 += i;
			i++;
		}
		System.out.println(sum3);

		int j = 1;
		while (j <= 100) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println();

		int k = 100;
		while (1 <= k) {
			System.out.print(k + " ");
			k--;
		}
*/
	}
}
