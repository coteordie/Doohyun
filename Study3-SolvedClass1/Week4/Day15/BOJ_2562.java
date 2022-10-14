package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2562 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int[] numArr = new int[9];
//		for(int i = 0; i < 9; i++) {
//			numArr[i] = Integer.parseInt(br.readLine());
//		}
//		int[] numArr2 = numArr;
//		System.out.println(Arrays.toString(numArr));
//
//		Arrays.sort(numArr);
//		
//		int max = numArr[8];
//		int location = 0;
//		
//		System.out.println(Arrays.toString(numArr2));
//		
//		for(int i = 0; i < 9; i++) {
//			if(max == numArr2[i]) {
//				location = i;
//			}
//		}
//		
//		System.out.println(max);
//		System.out.println(location);
		int max = 0;
		int location = 0;
		int[] numArr = new int[9];
		for(int i = 0; i < 9; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < numArr.length; i++) {
			if(max < numArr[i]) max = numArr[i];
		}
		for(int i = 0; i < numArr.length; i++) {
			if(max == numArr[i]) location = i + 1;
		}
		
		System.out.println(max);
		System.out.println(location);
	}

}
