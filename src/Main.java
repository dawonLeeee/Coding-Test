import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] arr = new String[N];

		while(M--> 0){
			st = new StringTokenizer(br.readLine(), " ");
			int fst = Integer.parseInt(st.nextToken());
			int lst = Integer.parseInt(st.nextToken());
			String ball = st.nextToken();
			while(fst <= lst){
				arr[fst++ -1] = ball;
			}
		}
		for(int i = 0; i < N-1; i++){
			sb.append(null == arr[i] ? "0" : arr[i]).append(" ");
		}
		sb.append(null == arr[N-1]? "0" : arr[N-1]);
		System.out.println(sb);
	}
}