import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int i;
        for (i = 0; i <= N; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == N) {
                break;
            }
            if (i == N) {
                i = 0;
                break;
            }
        }
        System.out.println(i);
    }
}
