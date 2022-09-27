import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2864 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int A = 0;
		int B = 0;
		
		String[] max = new String[2];
		String[] min = new String[2];
		
		// 최소값
		for(int i = 0; i < str.length; i++) {
			if(str[i].contains("6")) {
				min[i] = str[i].replace("6", "5");
			}
			else min[i] = str[i];
		}
		System.out.print(Integer.parseInt(min[0]) + Integer.parseInt(min[1]) + " ");
		
		// 최대값
		for(int i = 0; i < str.length; i++) {
			if(str[i].contains("5")) {
				max[i] = str[i].replace("5", "6");
			}
			else max[i] = str[i];
		}
		System.out.print(Integer.parseInt(max[0]) + Integer.parseInt(max[1]));
		
		
	}

}
