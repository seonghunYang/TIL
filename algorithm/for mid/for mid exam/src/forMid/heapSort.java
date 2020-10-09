package forMid;

public class heapSort {
	
	public static void heapSort(int[] data) {
		int min_p = (data.length - 2) / 2;
		// buildheap
		for(int i=min_p; i>=0; i--) {
			heapify(data, i, data.length);
		}
		// root에 있는 거 멘 뒤로 swap 하면서 heapify
		for(int i=data.length-1; i>=1; i--) {
			swap(data, 0, i);
			heapify(data, 0, i);
		}
		
	}
	
	
	public static void heapify(int[] data,int p_idx, int len) {
		int l_idx = p_idx * 2 + 1;
		int r_idx = p_idx * 2 + 2;
		int max_idx = 0;
		if(r_idx < len) {
			if(data[l_idx] < data[r_idx]) {
				max_idx = r_idx;
			} else max_idx = l_idx;
		} else if (l_idx < len) max_idx = l_idx;
		else return;
		
		if(data[max_idx] > data[p_idx]) {
			swap(data, p_idx, max_idx);
			heapify(data, max_idx, len);
		}
	}
	public static void swap(int[] data, int p, int q) {
		int temp = data[q];
		data[q] = data[p];
		data[p] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {2, 2, 1, 5, 2, 13, 2, 7, 8, 3, 10};
		heapSort(data);
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
