package solvedClass1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int[] number = new int[str.length];
		int[] newNumber = new int[number.length];
		int sum = 0;
		
		for(int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(str[i]);
			newNumber[i] = number[i] * number[i];
			sum += newNumber[i];
		}
		
		System.out.println(sum % 10);
		
		
	}

}
