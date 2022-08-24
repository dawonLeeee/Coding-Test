

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n];
        
        for(int i : lost)
        	arr[i-1]--;
        for(int i : reserve)
        	arr[i-1]++;
        
        if(arr[0] == -1) {
        	if(arr[1] == 1) {
        		arr[0] = 0;
        		arr[1] = 0;
        	}
        }
  
        for(int i = 1; i < n - 1; i++) {
        	if(arr[i] == -1) {
        		if(arr[i-1] == 1) {
        			arr[i-1] = 0;
        			arr[i] = 0;
        		} else if(arr[i+1] == 1) {
        			arr[i] = 0;
        			arr[i+1] = 0;
        		}
        	}
        }
        if(arr[n-1] == -1) {
        	if(arr[n-2] == 1) {
        		arr[n-1] = 0;
        		arr[n-2] = 0;
        	}
        }
        
        for(int i: arr)
        	if(i != -1) answer++;
        
        	
        
        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution sol = new Solution();
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		System.out.println(sol.solution(5, lost, reserve));
	}
}