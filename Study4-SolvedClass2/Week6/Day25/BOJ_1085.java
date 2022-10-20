package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int disX = ((x - 0) > (w - x)) ? w - x : x - 0;
		int disY = ((y - 0) > (h - y)) ? h - y : y - 0;
		
		if(disX >= disY) {
			System.out.println(disY);
		} else {
			System.out.println(disX);
		}

	}

}
