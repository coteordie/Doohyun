package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2577 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] numArr = new int[3];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		String result;
		result = Integer.toString(numArr[0] * numArr[1] * numArr[2]);
		
		String[] number = new String[result.length()];
		number = result.split("");

		int cnt = 0;
		for(int i = 0; i < number.length; i++) {
			if(Integer.parseInt(number[i]) == 0) {
				cnt++;
			}
		}
		
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		for(int i = 0; i < number.length; i++) {
			switch(number[i]) {
			case "1": one++; break;
			case "2": two++; break;
			case "3": three++; break;
			case "4": four++; break;
			case "5": five++; break;
			case "6": six++; break;
			case "7": seven++; break;
			case "8": eight++; break;
			case "9": nine++; break;
			}
		}
		
		System.out.println(cnt);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println(eight);
		System.out.println(nine);
		
	}

}
