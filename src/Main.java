import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main  {
	static LinkedList<Integer> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[t];
		int sum = 0;
		int i = 0;
		while(t-->0){
			int tmp = Integer.parseInt(br.readLine());
			if(tmp == 0){
				sum -= arr[--i];
			} else {
				sum += tmp;
				arr[i++] = tmp;
			}
		}
		System.out.println(sum);
	}
}




	



	

	
	



