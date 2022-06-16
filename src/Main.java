import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
       public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set  = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            set.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++){
            String num = st.nextToken();
            if(set.contains(num))
                set.remove(num);
            else
                set.add(num);
            }
        System.out.println(set.size());
        }
}