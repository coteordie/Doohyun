package coteordie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17614 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 10 을 넣으면 3이 출력
		int clapNum = 0;
		int rest = 0;

		for(int i = 1; i <= N; i++) {
			int temp = i;
			while(temp > 0) {
				rest = temp % 10;
				if(rest == 3 || rest == 6 || rest ==9) {
					clapNum += 1;
				}
				temp = temp / 10;
			}
		}
		System.out.println(clapNum);			
	}
}
