import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i<N; i++) {
            String S = br.readLine();
            boolean check[] = new boolean[26];
            boolean tmp = true;

            for(int j = 0; j<S.length(); j++) {
                int index = S.charAt(j)-'a';
                if(check[index]) {
                    if(S.charAt(j) != S.charAt(j-1)) {
                        tmp = false;
                        break;
                    }
                } else {
                    check[index] = true;
                }
            }
            if(tmp) cnt++;
        }

        System.out.println(cnt);

    }
}
