package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int zip = 1;
		int up = 1;
		
		while(true) {
			int upFor = up + 1;
			for(int i = zip; i < upFor; i++) {
				zip = i;
				if(zip == N) break;
			}
			if(zip == N) break;
			up = cnt * 6 + zip;
			++cnt;
			++zip;
		}
		
		System.out.println(cnt);

	}

}
