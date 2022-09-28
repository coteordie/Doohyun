import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1436 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int movieName = 666;
		int cnt = 1;
		
		if(N == 1) {
			System.out.println(movieName);
		}
		else if(N > 1) {
			while(N != cnt) {
				movieName++;
				if(String.valueOf(movieName).contains("666")) {
					cnt++;
				}
			}
			System.out.println(movieName);
		}

	}

}
