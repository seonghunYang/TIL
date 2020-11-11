package forMid;
import java.util.Arrays;
import java.util.Scanner;
public class Dp_1110_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] sort_arr = arr.clone();
		Arrays.sort(sort_arr);
		
		int[][] subSequenceLength = new int[sort_arr.length+1][arr.length+1];
		for(int i=1; i<=sort_arr.length; i++) {
			for(int j=1; j<=arr.length; j++) {
				if (sort_arr[i-1] == arr[j-1])
					subSequenceLength[i][j] = subSequenceLength[i-1][j-1] + 1;
				else
					subSequenceLength[i][j] = Math.max(subSequenceLength[i-1][j], subSequenceLength[i][j-1]);
			}
		}
		
		System.out.println(subSequenceLength[sort_arr.length][arr.length]);
	}

}
