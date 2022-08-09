import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st_minus = new StringTokenizer(br.readLine(), "-");
		
		int sum = 0;
		StringTokenizer st_num;
		
		if(st_minus.countTokens() >= 1) {
			st_num = new StringTokenizer(st_minus.nextToken(), "-|+");
			while(st_num.hasMoreTokens())
				sum += Integer.parseInt(st_num.nextToken());
			while(st_minus.hasMoreTokens()) {
				st_num = new StringTokenizer(st_minus.nextToken(), "-|+");
				while(st_num.hasMoreTokens())
					sum -= Integer.parseInt(st_num.nextToken());
			}
		} else {
			st_num = new StringTokenizer(st_minus.nextToken(), "+");
			while(st_num.hasMoreTokens())
				sum += Integer.parseInt(st_num.nextToken());
		}
		
		System.out.println(sum);
		
	}
}
	
	



