package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11720 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split("");
		int[] numArr = new int[N];
		for(int i = 0; i < N; i++) {
			numArr[i] = Integer.parseInt(num[i]);
		}
		
		int sum = 0;
		for(int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		System.out.println(sum);
		
	}

}
