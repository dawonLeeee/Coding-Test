


public class Solution {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i = 0; i < signs.length; i++) {
			answer += returnAbs(absolutes[i], signs[i]);
		}

        return answer;
    }
	
	public int returnAbs(int num, boolean flag) {
		if(!flag)
			num = -num;
		return num;
	}
}