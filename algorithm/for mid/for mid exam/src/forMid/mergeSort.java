package forMid;

public class mergeSort {
	
	public static void mergeSort(int[] data, int p, int q) {
		if (p >= q) return ;
		int[] merged = new int[q-p+1];
		int mid = (p+q) / 2;
		mergeSort(data, p, mid);
		mergeSort(data, mid+1, q);
		
		int l = p;
		int r = mid+1;
		int k = 0;
		
		while (l <= mid && r <= q) {
			if(data[l] <= data[r]) {
				merged[k++] = data[l++];
			} else merged[k++] = data[r++];
		}
		
		while(l <= mid) {
			merged[k++] = data[l++];
		}
		while(r <= q) {
			merged[k++] = data[r++];
		}
		k=0;
		while(p <= q) {
			data[p++] = merged[k++];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {2, 2, 1, 5, 2, 13, 2, 7, 8, 3, 10};
		mergeSort(data,0,data.length-1);
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
	}

}
