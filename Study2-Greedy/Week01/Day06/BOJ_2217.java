import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2217 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] rope = new int[N];
		
		for(int i = 0; i < N; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		// 배열의 최솟값
		Arrays.sort(rope);
		int temp = 0;
		for(int i = 0; i < rope.length; i++) {
			if(i > 0) {
				temp = (i + 1) * rope[rope.length - 1 - i];
			} else {				
				max = (i + 1) * rope[rope.length - 1];
			}
			if(temp > max) max = temp;
		}
		
		System.out.println(max);
		
	}

}
