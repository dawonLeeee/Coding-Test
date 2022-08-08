import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int count = 0;
		int sum = 0;
		for(int i = 1; i < 50; i++) {
			for(int j = 1; j <= i; j++) {
				count++;
				if(count >= A && count <= B) {
					
					
					sum += i;
				}
			}
			
		}
		System.out.println(sum);
	}
}