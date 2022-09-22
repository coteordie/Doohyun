package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10162 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int A = 300;
		int B = 60;
		int C = 10;
		int[] abc = {A, B, C};
		
		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		
		int[] cnt = {cntA, cntB, cntC};
		
		for(int i = 0; i < abc.length; i++) {
			cnt[i] = T / abc[i];
			T = T % abc[i];
		}
		if(T != 0) {
			System.out.println(-1);
		} else {
			System.out.println(cnt[0] + " " + cnt[1] + " " + cnt[2]);
		}
		
	}

}
