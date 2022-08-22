import java.util.Arrays;

class Solution {

    public static void solution(String[] participant, String[] completion) {
    	
    	
    	
    	
        String answer = "";
        
        Arrays.sort(participant);
        System.out.println(Arrays.toString(participant));
        Arrays.sort(completion);
        System.out.println(Arrays.toString(completion));
        
        for(int i = 0; i < completion.length; i++) {
        	if(completion[i] != participant[i]) {
        		answer += participant[i];
        		break;
        	}
        		
        }
        if(answer.equals(""))
        	answer += participant[participant.length-1];
        
        System.out.println(answer);
    }
	
}