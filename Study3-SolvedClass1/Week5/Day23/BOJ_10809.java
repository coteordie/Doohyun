package solvedClass1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] S = br.readLine().split("");
		int[] result = new int[26];
		for(int i = 0; i < 26; i++) {
			result[i] = -1;
		}
		
		for(int i = 0; i < S.length; i++) {
			char ch = S[i].charAt(0);
			if(result[ch - 'a'] == -1)	result[ch - 'a'] = i;
		}
		
		for(int result2 : result) {
			System.out.print(result2 + " ");
		}

	}

}
