package forMid;

public class RadixSortUsingCounting {
	public static int changeDigit(int num, int digit) {
		return (num / digit) % 10; 
	}
	
	public static void radixSort(int[] data, int max_digit) {
		int[] cnt_list ;
		int[] digit_sort = new int[data.length];
		int digit = 1;
		while(max_digit >= digit) {
			cnt_list = new int[10];
			for(int i=0; i<data.length;i++) {
				cnt_list[changeDigit(data[i], digit)]++;
			}
			for(int i=1; i<10; i++) {
				cnt_list[i] += cnt_list[i-1];
			}
			for(int i=data.length-1; i>=0; i--) {
				System.out.println(cnt_list[changeDigit(data[i], digit)]-1);
				digit_sort[cnt_list[changeDigit(data[i], digit)]-- -1] = data[i];
			}
			for(int i=0; i<data.length; i++) {
				data[i] = digit_sort[i];
			}
		digit *= 10;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {200, 132, 102, 561, 223, 139, 289, 739, 812, 356, 10};
		radixSort(data, 100);
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
