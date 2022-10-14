package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2675 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); 
		
		String[][] str = new String[T][2];
		for(int i = 0; i < T; i++) {
			String[] inNum = br.readLine().split(" ");
			for(int j = 0; j < inNum.length; j++) {
				str[i][j] = inNum[j];
			}
		}
		
		for(int i = 0; i < str.length; i++) {
			String result = null;
			String[] srsr = new String[str[i][1].length()];
			srsr = str[i][1].split("");
			System.out.println(Arrays.toString(srsr));
			for(int j = 0; j < Integer.parseInt(str[i][0]); j++) {
			}
			System.out.println(result);
		}

	}

}
