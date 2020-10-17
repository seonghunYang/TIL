package forMid;
import java.util.Scanner;
public class sqSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        int[] cnt_data = new int[1001];
        int[] resultData = new int[n];
        for(int i =0; i < n; i++) {
            data[i] = sc.nextInt();
            cnt_data[data[i]]++;
        }
        for(int i=1; i < 1001; i++) {
            cnt_data[i] = cnt_data[i] + cnt_data[i-1];
        }
        for(int i=n-1; i >=0; i--) {
            resultData[i] = cnt_data[data[i]] - 1;
            cnt_data[data[i]]--;
        }
        for(int i=0; i < n; i++) {
            System.out.print(resultData[i] + " ");
        }
	}
}
