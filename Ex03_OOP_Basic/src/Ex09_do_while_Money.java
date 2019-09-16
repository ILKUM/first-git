import java.util.Scanner;

public class Ex09_do_while_Money {

	static int unit = 10000;
	static int num;
	static int sw;

	static Scanner sc = new Scanner(System.in);
	
	static int money;
	static void cal() {
		money = Integer.parseInt(sc.nextLine());
		do {
			
			num = money / unit;
			System.out.printf("%d %d°³\n", unit, num);
			if (unit > 1) {
				money -=unit * num;
				if (sw == 0) {
					unit = unit / 2;
					sw = 1;
				} else {
					unit = unit / 5;
					sw = 0;
				}
			} else {
				break;
		}
		}while(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal();
	}
}
