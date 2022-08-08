import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    
    static int gcd(int a, int b) { // Greatest Common Number
    	swap(a, b);
    	
    	while(b != 0) {
	    	a = b;
	    	b = r;
    	}
    	return a;
    }
    
    static void swap(int a, int b) {
    	if(a < b) {
    		int tmp;
    		tmp = a;
    		a = b;
    		b = tmp;
    	}
    }
    
    
    

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       int n1 = Integer.parseInt(st.nextToken());
       int n2 = Integer.parseInt(st.nextToken());
           
       int gcd = gcd(n1, n2);
       int lcd = n1 * n2 / gcd;
       System.out.println(gcd);
       System.out.println(lcd);
       }
       
}