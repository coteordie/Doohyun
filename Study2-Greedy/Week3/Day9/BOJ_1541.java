package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1541 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String[] strArr2 = str.split("\\-");
		int[] result = new int[strArr2.length];
		for(int i = 0; i < strArr2.length; i++) {
			int sum = 0;	
			if(strArr2[i].contains("+")) {		
				String[] sumArr = strArr2[i].split("\\+");	
				int[] plus = new int[sumArr.length];
				for(int j = 0; j < plus.length; j++) {
					plus[j] = Integer.parseInt(sumArr[j]);	
					sum += plus[j];
				}
				result[i] = sum;	
			} else {
				result[i] = Integer.parseInt(strArr2[i]);
			}
		}
		int min = result[0];
		for(int k = 1; k < result.length; k++) {
			min -= result[k];
		}

		System.out.println(min);
	}

}
