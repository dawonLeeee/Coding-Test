import javax.sound.sampled.EnumControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder stringBuilder = new StringBuilder();

		int N = Integer.parseInt(st.nextToken()); // 배열의 크기
		int M = Integer.parseInt(st.nextToken());
		List<Integer> lst = new ArrayList<>();

		while(true){
			int a = Integer.parseInt(br.readLine());
			if(a > M) break;
			lst.add(a);
		}

		System.out.println(minCnt(lst, M));

	}

	public static int minCnt(List<Integer> lst, int M) {
		int cnt = 0;
		int total = 0;
		int i = lst.size() - 1;
		while(i >= 0 && M != total) {
			while(M < (total + lst.get(i))) i--;
			total += lst.get(i);
			cnt++;
		}

		return cnt;
	}
}

