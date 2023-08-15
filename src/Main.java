import javax.sound.sampled.EnumControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 배열의 크기

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[][] arr = new int[N][2];
		int[] arr2 = new int[N];

		for(int i = 0; i < N; i++){
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = i;
		}

		sort(arr);

		for(int i = 0; i < N; i++){
			arr2[arr[i][1]] = i;
		}

		for(int i = 0; i < N; i++){
			System.out.print(arr2[i] + " ");
		}



	}

	public static void sort(int[][] solArr){

		Arrays.sort(solArr, (i1,i2) -> {
			if(i2[0] == i1[0]) {
				return i1[1] - i2[1];
			}
			else return i1[0] - i2[0];
		});

	}





}

