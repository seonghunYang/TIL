package forMid;
import java.util.Arrays;

public class Dp_1110_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[] cache = new int[n+1];
		cache[1] = 1;
		cache[2] = 2;
		for(int i = 3; i <= n; i++) {
			cache[i] = cache[i-1] + cache[i-2];
		}
		System.out.println(cache[n]);
	}

}
