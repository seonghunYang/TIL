package forMid;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {2, 2, 1, 5, 2, 13, 2, 7, 8, 3, 10};
		boolean sorted = true;
		for(int i=data.length-1; i>0; i--) {
			for(int j=0; j < i; j++) {
				if(data[j] > data[j+1]) {
					// data[j] <-> data[j+1];
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					sorted = false;
				}
			}
			if (sorted == true) break;
		}
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
