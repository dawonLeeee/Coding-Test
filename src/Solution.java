import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : arr) {
        	if(i % divisor == 0) {
        		count++;
        		list.add(i);
        	}
        }

        
        if(count == 0) answer = new int[] {-1};
        else {
        	answer = new int[count];
        	int cnt = 0;
        	for(int i : list)
        		answer[cnt++] = i;
        		
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}