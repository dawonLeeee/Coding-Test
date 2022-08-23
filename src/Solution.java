import java.util.Arrays;

class Solution {
    public static int[] solution(int[] answers) {
        int[] answer;
        
        int[] arrA = {1, 2, 3, 4, 5};
        int[] arrB = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arrC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int a, b, c;
        int countA = 0; 
        int countB = 0;
        int countC = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < answers.length; i++) {
            
        	
        	if(i == 0) { a = b = c = 0;}
        	else {
	        	a = i % arrA.length;
	        	b = i % arrB.length;
	        	c = i % arrC.length;
        	}
        	
        	if(arrA[a] == answers[i]) countA++;
        	if(arrB[b] == answers[i]) countB++;
        	if(arrC[c] == answers[i]) countC++;
        }
        
        System.out.println("countA : " + countA);
        System.out.println("countB : " + countB);
        System.out.println("countC : " + countC);
        
        
        max = Math.max(Math.max((Math.max(max, countA)), countB), countC);
        
        if(max == countA && max == countB && max == countC) {
        	answer = new int[]{1,2, 3};
    	}else if(max == countA && max == countB) {
        	answer = new int[]{1,2};
        } else if(max == countA && max == countC) {
        	answer = new int[]{1,3};
        } else if(max == countB && max == countC) {
        	answer = new int[] {2, 3};
        } else
        	answer = new int[] {
        			(max == countA ? 1 : (max == countB ? 2 : 3))
        	};
        
 
        return answer;
    }
    
    public static void main(String[] args) {
		int[] answers1 = {1, 2, 3, 4, 5};
		int[] answers2 = {1,3,2,4,2};
		
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution(answers2)));
	}
}