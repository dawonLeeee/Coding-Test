import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.StringTokenizer;


public class Main {
    static int fake1 = 0;
    static int fake2 = 0;

       public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int[] a = new int[9];
           int sum = 0;
           for(int i = 0; i < 9; i++) {
               int num = Integer.parseInt(br.readLine());
               a[i] = num;
               sum += num;
           }
           Arrays.sort(a);

           for(int i = 0; i < 8; i++)
               for(int j = i + 1; j < 9; j++)
                   if(sum - (a[i] + a[j]) == 100) {
                       fake1 = a[i];
                       fake2 = a[j];
                   }


           for(int i = 0; i < 9; i++) {
               if((fake1 == a[i]) || fake2 == a[i]) continue;
               System.out.println(a[i]);
           }
       }
}