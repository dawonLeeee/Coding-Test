import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
       public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> peopleIn = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < N; i++){
            String name = br.readLine();
            peopleIn.put(name, name);
        }


        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String name = br.readLine();
            if(peopleIn.containsKey(name))
                set.add(name);
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println(list.size());
        for(String s: list)
            System.out.println(s);
    }
}