import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length - 1; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        
        answer = new int[set.size()];
        int j = 0;
        for(int i : set) {
        	answer[j++] = i;
        }
        
        Arrays.sort(answer);
        	
        
        
        
        
        
        
        
        
        
        return answer;
    }
    public static void main(String[] args) {
		Solution sol = new Solution();
		
		int[] arr = {2, 1, 3, 4, 1};
		System.out.println(sol.solution(arr));
	}
}