package coteordie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String star = "";
		
		for(int i = 0; i < num; i++) {
			star += "*";
			System.out.println(star);
		}
	}

}
