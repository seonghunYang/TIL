package forMid;

public class insertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {2, 2, 1, 5, 2, 13, 2, 7, 8, 3, 10};
		
//		for(int i=1; i<data.length;i++) {
//			int newItem = data[i];
//			for(int j=i-1; j>=-1;j--) {
//				if(j == -1 || data[j] <= newItem) {
//					data[j+1] = newItem;
//					break;
//				}
//				else {
//					data[j+1] = data[j];
//				}
//			}
//		}
		for(int i=1; i<data.length; i++) {
			for(int j=i; j>=1; j-- ) {
				if(data[j] < data[j-1]) {
					int temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				} else {break;}
			}
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
