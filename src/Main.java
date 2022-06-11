
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<Integer, Integer> findRankMap = new HashMap<>();

        for(int i = 0; i < N; i++){
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken() );
        }
        Arrays.sort(sorted);

        StringBuilder sb = new StringBuilder();
        int rank = 0;
        for(int v: sorted) {
            if (!findRankMap.containsKey(v)){
                findRankMap.put(v, rank);
                rank++;
            }
        }
        for(int key : origin){
            int ranking = findRankMap.get(key);
            sb.append(ranking).append(" ");
        }
        System.out.println(sb);
    }
}


