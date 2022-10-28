package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15829 {
	final static int M = 1234567891;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int L = Integer.parseInt(br.readLine());
		
		int[] numArr = new int[L];
		String[] str = br.readLine().split("");
		for(int i = 0; i < L; i++) {
			numArr[i] = str[i].charAt(0) - 96;
		}
			
		long sum = 0;
		long hash = 1;
		
		for(int i = 0; i < numArr.length; i++) {
			sum += (numArr[i] * hash) % M;
			hash = hash * 31 % M;
		}
		System.out.println(sum % M);

	}

}
