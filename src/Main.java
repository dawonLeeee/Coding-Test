import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static HashMap<Integer, Integer> map = new HashMap<>();
    static StringTokenizer st;
    static BufferedReader br;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");


        for(int i = 0; i < N; i++){
            int key = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            int number = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(number, 0)).append(" ");
        }
        System.out.println(sb);

    }
}