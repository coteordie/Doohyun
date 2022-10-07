package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2884 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int[] time = new int[2];
		for(int i = 0; i < str.length; i++) {
			time[i] = Integer.parseInt(str[i]);
		}
		
		int hour = time[0];
		int minute = time[1];
		
		if(hour != 0) {
			if(minute < 45) {
					hour -= 1;
					minute = minute + 15;
			} else {
				minute = minute - 45;
			}
		} else {
			if(minute < 45) {
				hour = 23;
				minute = minute + 15;				
			} else if(minute == 45) {
				hour = 0;
				minute = 0;
			} else {
				hour = 0;
				minute = minute - 45;								
			}
		}

		System.out.println(hour +  " " + minute);
		
	}

}
