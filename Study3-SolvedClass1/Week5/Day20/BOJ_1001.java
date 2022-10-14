package solvedClass1plus;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1001 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int[] number = new int[str.length];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(str[i]);
		}

		System.out.println(number[0] - number[1]);

	}

}
