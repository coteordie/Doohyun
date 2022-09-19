package coteordie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String star = "";
		String blank = "";
		
		for(int i = 0; i < num; i++) {
			for(int j = num-i-1; j > 0; j--) {
				String blank2 = " ";
				blank += blank2;
			}
			star += "*";
			System.out.println(blank + star);
			blank = "";
		}
	}
}
