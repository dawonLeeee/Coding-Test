
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[N];


        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        HashSet<String> set = new HashSet<>(List.of(arr));
        String[] brr = set.toArray(new String[0]);

        Arrays.sort(brr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                else
                    return o1.length() - o2.length();


            }

        });

        for(int i = 0; i < brr.length; i++){
            sb.append(brr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
