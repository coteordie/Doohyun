package solvedClass1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		StringBuilder sb = new StringBuilder();
		
		while( (str = br.readLine()) != null) {
			String[] strArr = str.split(" ");
			int A = Integer.parseInt(strArr[0]);
			int B = Integer.parseInt(strArr[1]);
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);

	}

}
