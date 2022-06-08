import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int median = 10000; // 중앙값
        int mode = 10000; // 최빈값



        for(int i = 0; i < N; i++){
            int value = Integer.parseInt(br.readLine());
            sum += value;
            arr[value+4000]++;

            if(max < value)
                max = value;
            if(min > value)
                min = value;
        }

        int count = 0;
        int mode_max = 0; // 중앙값의 최빈값

        boolean flag = false;

        for(int i = min + 4000; i <= max + 4000; i++) {
            //중앙값 구하기
            if (arr[i] > 0) {
                if (count < (N + 1) / 2) {
                    median = i - 4000;
                    count += arr[i];
                }

                if (mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if (mode_max == arr[i] && flag) { // 이전 최빈값과 동일한 경우면서 한 번만 중복되는 경우
                    mode = i - 4000;
                    flag = false;
                }
            }
        }


        System.out.println((int)Math.round((double)sum / N));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
        }
}
