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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		List<Integer> lst = new ArrayList<>();
		int val = 0;
		int tmp = 0;
		String str = "";

		for(int i = 1; i <= N; i++){
			lst.add(i-1, i);
		}

		for(int j = 0; j < M; j++){
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if((b-a)%2 == 1) {
				val = (b-a)/2+1;
			} else {
				val = (b-a)/2;
			}
			for(int k = 0; k < val; k++){
				tmp = lst.get(a-1+k);
				lst.set(a-1+k, lst.get(b-1-k));
				lst.set(b-1-k, tmp);
			}

			for(int i = 0; i < lst.size(); i++){
				str += lst.get(i) + " ";
			}
			System.out.println(str);
			System.out.println("\n");
		}

		for(int i = 0; i < lst.size(); i++){
			str += lst.get(i) + " ";
		}
		System.out.println(str);
	}
}


