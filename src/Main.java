import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();


        for(int i = 0; i < N; i++){
            String pocketmon = br.readLine();
            String number = Integer.toString(i+1);
            map.put(pocketmon, number);
            map.put(number, pocketmon);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String key = br.readLine();
            sb.append(map.get(key)).append("\n");
        }
        System.out.println(sb);
    }



}