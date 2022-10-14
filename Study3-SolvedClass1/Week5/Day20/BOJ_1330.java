package solvedClass1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1330 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int[] number = new int[str.length];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(str[i]);
		}
		
		if(number[0] > number[1]) System.out.println(">");
		else if(number[0] == number[1]) System.out.println("==");
		else System.out.println("<");

	}

}
