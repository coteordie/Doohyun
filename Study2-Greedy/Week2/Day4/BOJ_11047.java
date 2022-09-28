package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11047 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		
		int N = Integer.parseInt(num[0]);
		int K = Integer.parseInt(num[1]);
		
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		int cnt = 0; 
        for(int i = A.length - 1; i >= 0; i--) { 
            cnt += K / A[i];
            K %= A[i];
        }
        System.out.println(cnt);
		
	}

}
