import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    	int count = 1;
        int[] answer = {};
        
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i-1] == arr[i]) {
        		arr[i-1] = -1;
        	} else count++;
        }
        
        answer = new int[count];
        
        int j = 0;
        for(int i: arr) {
        	if(i != -1)
        		answer[j++] = i;
        }
        
        return answer;
    }
}