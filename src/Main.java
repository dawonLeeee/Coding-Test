import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int[] arr = new int[26];
        for(int i = 0; i<26; i++)
            arr[i] = -1;

        byte[] str = S.getBytes();

        for(int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(arr[ch-'a'] == -1)
                arr[ch-'a'] = i;
        }

        for(int val: arr)
            System.out.print(val + " ");

    }
}
