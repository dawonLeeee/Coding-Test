import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] arr = new Integer[31];
		String result = "";

		for(int i = 1; i <= 30; i++){
			arr[i] = i;
		}
		for(int i = 1; i <= 28; i++){
			arr[Integer.parseInt(br.readLine())] = 0;
		}
		for(int i = 1; i <= 30; i++){
			result += (0 == arr[i] ? "" : arr[i] + " ");
		}
		System.out.println(result.trim());
	}
}