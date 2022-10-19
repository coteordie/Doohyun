package solvedClass1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10950 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		String[][] str = new String[T][2];
		for(int i = 0; i < str.length; i++) {
			str[i] = br.readLine().split(" ");
		}

		for(int i = 0; i < T; i++) {
			int[] arr = new int[2];
			for(int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(str[i][j]);
			}
			System.out.println(arr[0] + arr[1]);
		}

	}

}
