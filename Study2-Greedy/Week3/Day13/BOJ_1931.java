package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_1931 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] time = new int[N][2];
		for(int i = 0; i < time.length; i++) {
			String[] hour = br.readLine().split(" ");
			int[] hour2 = new int[hour.length];
			for(int k = 0; k < hour.length; k++) {
				hour2[k] = Integer.parseInt(hour[k]);
			}
			for(int j = 0; j < 2; j++) {
				time[i][j] = hour2[j];
			}
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {	
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}	
				return o1[1] - o2[1];
			}
 
		});
		
		int cnt = 0;
		int start = 0;
		
		for(int i = 0; i < N; i++) {
			// 첫 회의가 시작되는걸 찾고, 
			if(start <= time[i][0]) {
				// 다음회의시간을 첫 회의 끝나는시간보다 커야하니까 다시 start를 회의 끝나는시간으로 줘
				start = time[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
 	}

}
