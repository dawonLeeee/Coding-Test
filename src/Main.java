
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next().toLowerCase();
        int[] arr = new int[26];

        for(int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            arr[ch-'a']++;
        }

        int max = -1;
        char ch = '?';
        for(int i = 0; i<26; i++){
            if(arr[i]>max) {
                max = arr[i];
                ch = (char)(i + 65);
            }
            else if(arr[i] == max)
                ch = '?';
        }
           System.out.println(ch);




    }
}
