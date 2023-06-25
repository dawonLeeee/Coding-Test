import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		List<Integer> arr = new ArrayList<>();
		int maxNum = -1;
		for(int i = 0; i < 9; i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++){
				int n = Integer.parseInt(st.nextToken());
				if(maxNum < n) maxNum = n;
				arr.add(n);
			}
		}
		System.out.println(maxNum);
		System.out.println((arr.indexOf(maxNum)/9 +1) + " " + (arr.indexOf(maxNum)%9+1));
	}
}


