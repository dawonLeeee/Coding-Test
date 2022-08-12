


public class Solution {
	public int solution(int[] numbers) {
        int answer = 0;
        int sumOneToTen = 0;
        int sum = 0;
        
        
        
        for(int n: numbers)
        	sum += n;
        
        
        
        for(int i = 0; i < 10; i++)
        	sumOneToTen += i;
        
        
        answer = sumOneToTen - sum;
        return answer;
    }
}