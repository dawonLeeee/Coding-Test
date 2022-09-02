
import java.util.Stack;


class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int count = 0;
        int num;
        
        Stack<Character> stack = new Stack<>();
        int[] arr = new int[3];



        for(int i = 0; i < dartResult.length() -1;) {
        	int cal = 1;

        	while(dartResult.charAt(i) <= '9' && dartResult.charAt(i) >= '0') 
        		stack.add(dartResult.charAt(i++));
        	
        	
        	stack.add(dartResult.charAt(i++)); // i = 2

        	if(i< dartResult.length()) {
	        	if((Character.compare(dartResult.charAt(i), '*') == 0)) {
	        		if(count != 0) arr[count-1] *= 2;
	        		System.out.println("2배 적용한 arr : " + arr[count]); // @@@@@@@@@@@@@@@@@@@@@@@2
	        		cal = 2;
	        		i++;
	        	} else if(dartResult.charAt(i) - '#' == 0) {
	        		cal  = -1;
	        		i++;
	        	} 
        	}
//        	System.out.println("##cal : " + cal);
        	

        	char tmp = stack.pop();
        	
        	if(stack.size() >= 2) {
        		num = 10;
        		stack.clear();
        	}
        	else
        		num = stack.pop() - 48;
        	System.out.println("num : " + num);// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        		

	        switch(tmp) {
		       	case 'S' : 
		       		cal *= num;

		       		break;
		       	case 'D' : 
		       		cal *= num * num;

		       		break;
		       	case 'T' : 
		       		cal *= num * num * num;

		       		break;
	        }
	        System.out.println("cal : " + cal);// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@22

	        
	        arr[count++] += cal;
	        System.out.println("arr[count] : " + arr[count-1]);// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
        }

        for(int i : arr)
        	answer += i;
        return answer;
    }
    
    public static void main(String[] args) {
		Solution sol = new Solution();
		
		
		String str1 = "10D10S0D";
		System.out.println(sol.solution(str1));
	}
}