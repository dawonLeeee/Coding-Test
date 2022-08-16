
import java.util.HashSet;
import java.util.Set;

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int countZero = 0;
        int count = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 6; i++) {
        	set.add(lottos[i]);
        	set.add(win_nums[i]);
        	if(lottos[i] == 0)
        		countZero++;
        }
        
        if(countZero != 0)
        	count = 12 - set.size() - countZero + 1;
        else
        	count = 12 - set.size();
        
        answer = new int[2];
        answer[0] = 7 - count - countZero;
        answer[1] = 7 - count;
        if(answer[0] == 7)
        	answer[0] = 6;
        if(answer[1] == 7)
        	answer[1] = 6;
        return answer;
    }
}