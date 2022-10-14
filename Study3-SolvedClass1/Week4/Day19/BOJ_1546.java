package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1546 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		
		Double[] grade = new Double[N];
		for(int i = 0; i < grade.length; i++) {
			grade[i] = Double.parseDouble(str[i]);
		}

 		Arrays.sort(grade);
		Double M = grade[N - 1];
		
		Double[] newGrade = new Double[N];
		for(int i = 0; i < newGrade.length; i++) {
			newGrade[i] = grade[i] / M * 100;
		}
		
		double avg = 0;
		double sum = 0;
		for(int i = 0; i < newGrade.length; i++) {
			sum += newGrade[i];
		}
		avg = sum / N;
		System.out.println(avg);
	}

}
