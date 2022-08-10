import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main  {
	
	static int sum;
	static int count;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[11];
		
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int j = 4; j <= 10; j++) {
			for(int i = j-1; i > j-4; i--) 
				arr[j] += arr[i];
		}
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(arr[N]).append("\n");
		}
		System.out.println(sb);
	}
		
}
	
	



