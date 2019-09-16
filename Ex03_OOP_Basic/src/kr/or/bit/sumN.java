package kr.or.bit;

public class sumN {
	
	public long Sum (int [] a) {
		long result = 0;
		for(int i = 1; i<=a.length; i++) {
			result += a [i];
		}
		return result;
	}
}
class Test {
    long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i<=a.length; i++) {
        	ans += a[i];
        }
        return ans;
    }
}

