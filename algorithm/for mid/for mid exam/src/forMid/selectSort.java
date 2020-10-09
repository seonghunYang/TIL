package forMid;

public class selectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {2, 2, 1, 5, 2, 13, 2, 7, 8, 3, 10};
		int max_idx = 0;
		for(int i=data.length-1; i>=1; i-- ) {
			for(int j=0; j<=i; j++) {
				if(data[max_idx] < data[j]) {
					max_idx = j;
				}
			}
			int max = data[max_idx];
			data[max_idx] = data[i];
			data[i] = max;
			max_idx = 0;
		}
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
