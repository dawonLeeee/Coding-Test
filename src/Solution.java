class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxLt = Integer.MIN_VALUE;
        int maxRt = Integer.MIN_VALUE;
        
        for(int i = 0; i < sizes.length; i++) {
        	if(sizes[i][0] > sizes[i][1]) {
        		int tmp = 0;
        		tmp = sizes[i][0];
        		sizes[i][0] = sizes[i][1];
        		sizes[i][1] = tmp;

        	}
        	
        	if(sizes[i][0] > maxLt)
        		maxLt = sizes[i][0];
        	if(sizes[i][1] > maxRt)
        		maxRt = sizes[i][1];
        }
        
      
        
        answer = maxLt * maxRt;
        
        return answer;
    }
}