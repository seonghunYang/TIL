package forMid;

public class quick {

	public static void quickSort(int[] data, int p, int q) {
		if (p >= q) return ;
		
		int pivot_idx = partition(data, p, q);
		quickSort(data, p, pivot_idx-1);
		quickSort(data, pivot_idx+1, q);
	}
	
	public static int partition(int[] data, int p, int q) {
//		int pivot = data[p];
//		int l = p+1;
//		for(int j=l; j<=q; j++) {
//			if(data[j] < pivot) {
//				swap(data, l++, j);
//			}
//		}
//		swap(data, p, l-1);
//		return l-1;
		
		int pivot = data[q];
		int l = p;
		for(int j=p; j<=q; j++) {
			if(data[j] < pivot) {
				swap(data, j, l++);
			}
		}
		swap(data, q, l);
		return l;
	}
	public static void swap(int[] data, int p, int q) {
		int temp = data[q];
		data[q] = data[p];
		data[p] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {2, 2, 1, 5, 2, 13, 2, 7, 8, 3, 10};
		quickSort(data,0,data.length-1);
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
