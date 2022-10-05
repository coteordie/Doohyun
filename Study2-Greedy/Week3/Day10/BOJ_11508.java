package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_11508 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Integer[] price = new Integer[N];
		for(int i = 0; i < N; i++) {
			price[i] = Integer.parseInt(br.readLine());
		}
		
		int result = 0;
		// �ּҰ� ���ϱ�
		Arrays.sort(price, Comparator.reverseOrder());

		for(int i = 0; i < price.length; i++) {
			if((i + 1) % 3 == 0) continue;
			result += price[i];
		}
	
		System.out.println(result);
	}

}
