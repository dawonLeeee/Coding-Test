class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int countMonster = 0;
        int numLen = nums.length / 2;
        
        boolean[] arr = new boolean[200001];
        
        for(int i = 0; i < nums.length; i++) {
        	arr[nums[i]] = true;
        }
        
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i]) countMonster++;
        }
        
        
        
        answer = numLen > countMonster? countMonster : numLen;
        
        
        
        return answer;
    }
}