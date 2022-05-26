import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String[][] arr = new String[][]{
                {"0"},
                {"1"},
                {"A","B","C"},
                {"D","E","F"},
                {"G","H","I"},
                {"J","K","L"},
                {"M","N","O"},
                {"P","Q","R","S"},
                {"T","U","V"},
                {"W","X","Y","Z"}
        };
        int sum = 0;
        for(int a = 0; a<A.length(); a++) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(A.charAt(a) == arr[i][j].charAt(0))
                        sum += (i+1);
                }
            }
        }
        System.out.println(sum);
    }
}
