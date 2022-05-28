import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
        long count = 1;

    if(B>=C)
        System.out.println("-1");
    else {

        while (true) {
            if (A >= ((C - B) * count))
                count++;
            else break;
        }
        System.out.println(count);
    }
    }
}
