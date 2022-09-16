package coteordie;

import java.util.Scanner;

public class BOJ_2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt(); // 216을 입력했다 치자.
		
		int N = 0; // 생성자		
		
		for(int i = 1; i < result; i++) {
			int k = 0;
			k = result - i;
			int sum = 0; // N의 각 자리수 합 구하기
			while(k != 0) {
				sum += k % 10;
				k /= 10;
			}
			k = result - i; // sum 확인 후 다시 설정
			if(k == result - sum) {
				N = k;
			}
		}
		System.out.println(N);
		sc.close();
	}

}
