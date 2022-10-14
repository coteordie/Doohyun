package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2908 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		String A = str[0];
		String B = str[1];
		
		String[] arrA = A.split("");
		String[] arrB = B.split("");

		String newA = "";
		String newB = "";
		
		for(int i = 2; i >= 0; i--) {
			newA += arrA[i];
			newB += arrB[i];
		}
		
		int reA = Integer.parseInt(newA);
		int reB = Integer.parseInt(newB);
		
		if(reA >= reB) {
			System.out.println(reA);
		} else {
			System.out.println(reB);
		}

	}

}
