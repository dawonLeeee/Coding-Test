import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		
		if(N == 4 || N == 7) {
			result = -1;
		} else 
			switch(N % 5) {
				case 1 : result = (N / 5) - 1 + 2; break;
				case 2 : result = (N / 5) - 2 + 4; break;
				case 3 : result = (N / 5) + 1; break;
				case 4 : result = (N / 5) - 1 + 3; break;
				default : result = (N / 5);
			
		}
		System.out.println(result);
	}
}


