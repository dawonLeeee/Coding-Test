import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String a = in.next();
        in.close();

        int sum = 0;
        for(int i = 0; i<a.length(); i++){
            sum += (int) a.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
