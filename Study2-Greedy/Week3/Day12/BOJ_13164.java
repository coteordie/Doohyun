package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_13164 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		String[] heights = br.readLine().split(" ");
		int[] intHeights = new int[heights.length];
		
		for(int i = 0; i < heights.length; i++) {
			intHeights[i] = Integer.parseInt(heights[i]);
		}
		
		int[] diff = new int[intHeights.length - 1];
		
		int result = 0;

		for(int i = 0; i < diff.length; i++) { 
			diff[i] = intHeights[i + 1] - intHeights[i];	
		}
		
		Arrays.sort(diff);
		
		for(int i = 0; i < N - K; i++) {
			result += diff[i];
		}
		
		System.out.println(result);
	}

}
