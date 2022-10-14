package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ_3052 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] number = new int[10];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(br.readLine());
		}
		
		String[] rest = new String[10];
		for(int i = 0; i < number.length; i++) {
			rest[i] = Integer.toString(number[i] % 42);
		}

		List<String> restArr = Arrays.asList(rest).stream().distinct().collect(Collectors.toList()); // 배열로도 들어가는거 좀 신기할지도.
		System.out.println(restArr.size());

	}

}
