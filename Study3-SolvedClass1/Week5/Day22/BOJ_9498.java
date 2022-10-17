package solvedClass1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int grade = Integer.parseInt(br.readLine());
		
		if(grade >= 90) {
			System.out.println("A");
		}else if(80 <= grade && grade < 90) {
			System.out.println("B");
		}else if(70 <= grade && grade < 80) {
			System.out.println("C");
		}else if(60 <= grade && grade < 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
