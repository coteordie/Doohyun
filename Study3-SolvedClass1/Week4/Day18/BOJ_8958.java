package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_8958 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] str = new String[N];
		
		for(int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}
		
		for(int i = 0; i < str.length; i++) {
			String[] ox = str[i].split("X");
			int result = 0;
 			for(int j = 0; j < ox.length; j++) {
 				ox[j].trim();
 				int score = 0;
 				int sum = 0;
				for(int k = 0 ; k < ox[j].length(); k++) {
					++sum;
					score += sum;
				}

				result += score;

			}
 			System.out.println(result);
		}

		
	}

}
