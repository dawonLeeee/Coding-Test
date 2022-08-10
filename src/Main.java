import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main  {
	
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0) {
			sb.append(solve(br.readLine())).append("\n");
		}
		System.out.println(sb);
		
		
	}
	
	public static String solve(String s) {
		int count = 0;
		for(char c: s.toCharArray()) {
			if(c == '(') 
				count++;
			else if(count == 0)
				return "NO";
			else
				count--;
		}
		if(count == 0)
			return "YES";
		else
			return "NO";
	}
		
}
	
	



