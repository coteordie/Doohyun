package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10818 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
		int[] numArr = new int[N];
		for(int i = 0 ; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(numArr);
		
		int max = numArr[0];
		int min = numArr[N - 1];
		System.out.println(max + " " + min);
		
	}

}
