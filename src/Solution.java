
import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = -1;
        int count = 0;
        
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j+1; k <nums.length; k++){
                	set.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(set);
//        System.out.println(list.toString()); // delete
        
        
        for(int a = 0; a < list.size(); a++) {
        	boolean flag = true;
        	
	        // list 중 소수 찾기
	        if(list.get(a) % 2 == 0)
	        	continue;
	        else {
	        
		        for(int i = 3; i <= Math.sqrt(list.get(a)); i += 2) {
		        	if(list.get(a) % i == 0){
		        		flag = false;
		        		break;
		        	//만일 i가 끝까지 돌았을때도 나누어떨어지지 않으면
		        	} 
		       
		        }
		        
		    }
	        if(flag) count++;
	        

        }
		

        answer = count;
        return answer;
    }
    
    public static void main(String[] args) {
		Solution sol = new Solution();
		
		int[] arr = {12, 45, 1, 5 ,51, 3, 6, 7, 9};
		
		System.out.println(sol.solution(arr));
	}
}