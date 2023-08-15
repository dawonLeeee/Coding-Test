import javax.sound.sampled.EnumControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[N][2];

		int i = 0;
		while(i < N){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			i++;
		}

		System.out.println(findHr(arr));




	}

	public static int findHr(int[][] arr) {

		Arrays.sort(arr, (t1, t2)->{
			return t1[1] - t2[1];
		});
		int N = arr.length;
		int total  = arr[N -1][1] - arr[N-1][0];
		while(--N > 0) {
			total = arr[N-1][1] > total ? total : arr[N-1][1];
			total -= arr[N - 1][0];
			if(total < 0) return -1;
			// total과 arr[][1]의 값과 비교해 더 작은걸
		}
		return total;
	}


}

