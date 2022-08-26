import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        
        for(int i = 0; i <= n + 1; i++)
        	map.put(i, 0);
        
        
       
       	for(int j : lost)
       		map.put(j, -1);
       	
       	for(int j : reserve) {
       		if(map.get(j) == -1)
       			map.put(j, 0);
       		else
       			map.put(j, 1);
       	}
        
        
        for(int i : map.keySet())
        	System.out.print(map.get(i) + " ");
        System.out.println();

        
        for(int i = 1; i <= n; i++) {
        	if(map.get(i) == -1) {
        		if(map.get(i-1) == 1) {
        			map.put(i, 0);
        			map.put(i-1, 0);
        		}
        		else if(map.get(i+1) == 1) {
        			map.put(i, 0);
        			map.put(i+1, 0);
        		}
        	}
        }
        
        
        
        for(int i : map.keySet())
        	System.out.print(map.get(i) + " ");
        System.out.println();

        
        for(int i : map.keySet())
        	if(map.get(i) >= 0)
        		answer++;
        
        
        
        
        return answer-2;
    }
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	
    	int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {3};
		
		System.out.println(sol.solution(n, lost, reserve));
		
	}
}