package coteordie;

import java.util.Scanner;

public class BOJ_2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		 
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		int result = 0; // 결과 넣을 곳
		
		for(int i = 0; i < N - 2; i++) { // 첫번째카드 시작부터
			for(int j = i+1; j < N - 1; j++) { // 
				for(int k = j+1; k < N; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum == M) {
						result = sum; break;
					}
					if(result < sum && sum < M) {
						result = sum;
					}
				}
			}
		}

		System.out.println(result);
		sc.close();
	}

}
