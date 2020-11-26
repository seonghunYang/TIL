package forMid;
import java.util.Arrays;

public class Dp_1110_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int squareLength = 4;
		int[] caseCount = new int[squareLength+1];
		caseCount[1] = 1;
		caseCount[2] = 2;
		for(int i = 3; i <= squareLength; i++) {
			caseCount[i] = caseCount[i-1] + caseCount[i-2];
		}
		System.out.println(caseCount[squareLength]);
	}

}
