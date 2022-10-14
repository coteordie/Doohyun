package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2920 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] da = new int[8];
		
		String[] input = br.readLine().split(" ");
		int[] sort = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] reverse = {8, 7, 6, 5, 4, 3, 2, 1};
		
		for(int i = 0; i < da.length; i++) {
			da[i] = Integer.parseInt(input[i]);
		}
		
		if(Arrays.equals(da, sort)) {
			System.out.println("ascending");
		} else if(Arrays.equals(da, reverse)) {
			System.out.println("descending");			
		} else {
			System.out.println("mixed");
		}
		
	}

}
