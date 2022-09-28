package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11399 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] time = new int[N];
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < str.length; i++) {
			time[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(time);
		
		int sum = 0;
		int total = 0;
		
		for(int i = 0; i < time.length; i++ ) {
			sum += time[i];
			total += sum;
		}
		System.out.println(total);
		
	}

}
