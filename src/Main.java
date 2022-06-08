import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10];


        while(N > 0){
            arr[N%10]++;
            N /= 10;
        }
        for(int j = 9; j >=0; j--) {
            sb.append(String.valueOf(j).repeat(arr[j]));
        }
        System.out.println(sb);
        }
}
