import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int count = 0;
	
     public static void main(String[] args) throws IOException  {
    	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	   br.readLine();
    	   
    	   
    	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	   while(st.hasMoreElements()) {
    		   int n =Integer.parseInt(st.nextToken());
    		   if(isPrime(n) == true)
    			   count++;
    	   }
    	   System.out.println(count);   
       }
       
     
     
       public static boolean isPrime(int n) {
    	   if(n <= 1)
    		   return false;
    	   
    	   for(int i = 2; i <= Math.sqrt(n); i++) {
    		   if(n % i == 0) return false;
    	   }
    	   return true;    	   
       }
       
       //시간복잡도가 O(n log(log n))인 방법
       public boolean[] make_prime(int Max) {
    	   boolean[] prime = new boolean[Max + 1]; // 0부터 시작하므로 +1
    	   prime[0] = true;
    	   prime[1] = true;
    	   
    	  
    	   for(int i = 2; i <= Math.sqrt(Max); i++) {
    		   //이미 걸러진 배열일 경우 다음 반복문으로 건너뜀
    		   if(prime[i] == true)
    			   continue;
    		   
    		   for(int j = i; j < Max + 1; j = j + i) {
    			   prime[j] = true;
    		   }
    	   }
    	   return prime;    	   
       }
}