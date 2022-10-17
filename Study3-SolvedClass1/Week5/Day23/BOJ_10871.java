package solvedClass1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		StringTokenizer number = new StringTokenizer(br.readLine(), " ");
		int[] numArr = new int[N];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(number.nextToken());
			if(numArr[i] < X) {
				System.out.print(numArr[i] + " ");
			}
		}
		
		
	}

}
