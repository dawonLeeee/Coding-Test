import java.util.Stack;

public class Solution  {
	static int answer;
	static Stack<Integer> stack;
	
	
	
	 public int solution(int[][] board, int[] moves) {
	        answer = 0;
	        
	        boolean flag = false;
	        stack = new Stack<>();
	        stack.push(0);
	        for(int i: moves) {
	        	for(int j = 0; j < board.length; j++) {
	        		while(board[j][i-1] != 0) {
	        			if(stack.peek() == board[j][i-1]) {
	        				stack.pop();
	        				answer += 2;
	        				
	        			} else {
	        				stack.push(board[j][i-1]);
	        			}
	        			board[j][i-1] = 0;
	        			break;
	        		}
	        	}
	        }
	        return answer;
	    }
}

