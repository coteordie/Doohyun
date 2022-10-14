package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1152 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		System.out.println(Arrays.toString(str));
		int count = 0;
		for(int i = 0; i < str.length; i++) {
			if(str[i] != "") count++;
		}
		
		System.out.println(count);

	}

}
