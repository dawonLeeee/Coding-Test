import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = 0;  int cnt = 0;


         for(int i = 0; i<1000000000; i++){
              cnt += i;
              num =  1 + cnt*6;
              if(N <= num) {
                   System.out.println(i+1);
                   break;
              }
         }
    }
}
