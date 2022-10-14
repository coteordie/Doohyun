package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1157 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		// 일단 모든 알파벳을 대문자로
		str = str.toUpperCase();
		
		int[] alphabet = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				alphabet[str.charAt(i) - 65]++;
			}
		}
		int max = 0;
		char ch = '.';
		
		for(int i = 0; i < 26; i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				ch = (char) (i + 65);
			} else if(max == alphabet[i]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
