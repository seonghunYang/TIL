package forMid;

public class quickSelect {
	
	public static int quickSelect(int[] data, int p, int q, int k) {
		if (p>=q) return data[q];
		
		int pivot_idx = partition(data, p, q);
		int pivot_k = pivot_idx - p + 1;
		if(pivot_k == k) return data[pivot_idx];
		else if (pivot_k > k) return quickSelect(data, p, pivot_idx-1, k);
		else return quickSelect(data, pivot_idx+1, q, k-pivot_k);
	}
	
	public static int partition(int[] data, int p, int q) {
		int pivot = data[p];
		int l = p+1;
		for(int r=l; r<=q; r++) {
			if(data[r] < pivot) {
				swap(data, l++, r);
			}
		}
		swap(data, l-1, p);
		return l-1;
	}
	
	public static void swap(int[] data, int p, int q) {
		int temp = data[q];
		data[q] = data[p];
		data[p] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1, 5, 2, 1, 2, 6, 7, 8};
		System.out.print(quickSelect(data, 0, data.length-1, 7));
	}

}
