import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.valueOf(br.readLine());
		long sum = 0;
		long count = 0;
		
		for(int i = 1; ; i++) {
			if(sum > num) break;
			sum += i;
			count++;
		}
		System.out.println(count - 1);
		
	}
	
	
}


