package forMid;
import java.util.Scanner;

public class DP_1102_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] P = new int[n];
		int[] F = new int[n];
		for(int i=0; i < n; i++) {
			P[i] = sc.nextInt();
		}
		for(int i=0; i < n; i++) {
			F[i] = sc.nextInt();
		}
		
		int[] cache = new int[n+1];
		
		for(int i=n-1; i>=0; i--) {
			cache[i] = Math.max(cache[i+1], P[i] + cache[i+F[i]+1]);
		}
		System.out.println(cache[0]);
	}

}
