package kr.or.bit;

public class Prime {

	public int primeNum(int n) {
		for (int i = 2; i < n; i++) { // 입력값보다 작은 수까지 나누어 소수 확인
			while (n % i == 0) { // 2~ n-1 까지 나누어 나머지가 남는다면 소수
					System.out.println("소수 아님");
					break;
			}
			break;
		}
		return n;
	}
}

	/*public int sumPrime(int n) {
		int sum = 0;
		for(int i =2; i<=n; i++) {// 입력값보다 작은 수까지 나누어 소수 확인
			for (int j = 2; j < i;) { // 입력값보다 작은 수까지 나누어 소수 확인
				while (n % j != 0) { // 2~ n-1 까지 나누어 나머지가 남는다면 소수
					j++;// i+1 하여 n-1까지 반복
				}

			}
			sum+= i;
		
	}return sum;
}
}*/
