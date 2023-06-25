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
		List<Integer> arr = new ArrayList<>();


		for(int i = 0; i < M * N;){
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()){
				arr.add(i++, Integer.parseInt(st.nextToken()));
			}
		}
		for(int i = 0; i < M * N;){
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()){
				arr.set(i, arr.get(i)+Integer.parseInt(st.nextToken()));
				i++;
			}
		}

		String str = "";
		for(int i = 0; i < arr.size(); i++){
			str += arr.get(i) + " ";
			if((i+1)%M == 0) str+= "\n";
		}
		System.out.println(str);
	}
}


