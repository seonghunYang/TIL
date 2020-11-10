package forMid;
import java.util.Arrays;
import java.util.Scanner;
public class Dp_1110_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int [n];
		for(int i=0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		int[] sort_data = data.clone();
		Arrays.sort(sort_data);
		
		int[][] cache = new int[sort_data.length+1][data.length+1];
		for(int i=1; i<=sort_data.length; i++) {
			for(int j=1; j<=data.length; j++) {
				if (sort_data[i-1] == data[j-1])
						cache[i][j] = cache[i-1][j-1] + 1;
				else
					cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
			}
		}
		
		System.out.println(cache[sort_data.length][data.length]);
	}

}
