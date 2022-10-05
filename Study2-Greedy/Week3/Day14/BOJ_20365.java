package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_20365 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		int result = 0;
		List<String> B = new ArrayList<>();
        List<String> R = new ArrayList<>();

        String color = br.readLine();
        StringTokenizer st = new StringTokenizer(color, "R");

        // B color만 모아담아
        while (st.hasMoreTokens()) {
            B.add(st.nextToken());
        }
        System.out.println(B);

        st = new StringTokenizer(color, "B");

        // R color만 모아담아
        while (st.hasMoreTokens()) {
            R.add(st.nextToken());
        }
        System.out.println(R);

        // 기본 전체를 깔고 개수가 많은걸 더해줘야해 기본은 1
        if (R.size() >= B.size()) {
        	result = B.size() + 1;
        } else {
        	result = R.size() + 1;
        }

        System.out.println(result);
		
	}

}
