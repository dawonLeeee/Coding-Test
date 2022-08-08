import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.prefs.BackingStoreException;

public class Main {
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	public static int[] operator = new int[4]; // 연산자 개수
	public static int[] number; // 숫자
	public static int N; // 숫자 개수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		number = new int[4];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(number[0], 1);
		System.out.println(max);
		System.out.println(min);
		
	}
	
	public static void dfs(int num, int idx) {
		if(idx == N) {
			max = Math.max(max, num);
			min = Math.min(min,  num);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			if(operator[i] > 0) {
				operator[i]--;
				
				switch(i) {
				case 0: dfs(num + number[idx], idx + 1); break;
				case 1: dfs(num - number[idx], idx + 1); break;
				case 2: dfs(num * number[idx], idx + 1); break;
				case 3: dfs(num / number[idx], idx + 1); break;
				}
				
				//재귀호출이 종료되면 다시 해당 연산자 개수를 복구한다
				operator[i]++;
			}
		
		
		
		
		}
	}
	
}
