package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_5585 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pay = Integer.parseInt(br.readLine());
		
		int totalMoney = 1000 - pay;
        int cnt = 0; 
        int coinTypes[] = {500, 100, 50, 10, 5, 1};
        for(int i = 0; i < coinTypes.length; i++) { 
            cnt += totalMoney / coinTypes[i];
            totalMoney %= coinTypes[i];
        }
        System.out.println(cnt);
    }
}
