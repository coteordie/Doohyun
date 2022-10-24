package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			for(int j = 1; j <= W; j++) {
				for(int k = 1; k <= H; k++) {
					cnt++;
					if(N == cnt) {
						H = k; 
						break;
					}
				}
				if(N == cnt) {
					W = j;
					break;
				}
			}
			String newW = (1 <= W && W <= 9)? "0" + Integer.toString(W) : Integer.toString(W); 
			sb.append(Integer.toString(H) + newW).append("\n");
			
		}
		System.out.println(sb);
		
		
	}

}
