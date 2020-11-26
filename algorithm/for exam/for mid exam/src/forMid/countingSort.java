package forMid;

public class countingSort {
	
	public static void countingSort(int[] data) {
		int max_value = data[0];
		for(int i=1; i<data.length;i++) {
			if(data[i]> max_value) max_value = data[i];
		}
		int[] cnt_list = new int[max_value+1];
		int[] sorted_list = new int[data.length];
		
		for(int i=0; i<data.length; i++) {
			cnt_list[data[i]]++;
		}
		for(int i=1; i<cnt_list.length; i++) {
			cnt_list[i] += cnt_list[i-1];
		}
		for(int i=data.length-1; i>=0; i--) {
			sorted_list[cnt_list[data[i]]-- -1] = data[i];
		}
		for(int i=0; i<data.length;i++) {
			data[i] = sorted_list[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {2, 2, 1, 5, 2, 13, 2, 7, 8, 3, 10};
		countingSort(data);
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
