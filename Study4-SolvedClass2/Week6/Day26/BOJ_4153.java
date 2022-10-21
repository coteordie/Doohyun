package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0 && c ==0) break;
			int[] abc = new int[3];
			abc[0] = a;
			abc[1] = b;
			abc[2] = c;
			Arrays.sort(abc);
			
			int max = abc[2];
			int sub1 = abc[1];
			int sub2 = abc[0];
			
			if(max*max == sub1*sub1 + sub2*sub2) {
				sb.append("right").append("\n");
			} else {		
				sb.append("wrong").append("\n");
			}
			
		}
		System.out.println(sb);

	}

}
