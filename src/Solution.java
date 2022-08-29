import java.util.ArrayList;

class Solution {
	static ArrayList<Integer> list = new ArrayList<>();
	
    public int solution(int n) {
        String str = "";
        
        tripleNum(n);
    	for(int i : list) {
    		str += i;
    	}
    	System.out.println("str : " + str);
    	int num = Integer.parseInt(str);
    	System.out.println("num : " + num);
    	

    	int answer = Integer.parseInt(str, 3);
  
    	
    	return answer;
    }

    public void tripleNum(int n) {
    	if(n == 0) return;
    		
    	list.add(n%3);
    	tripleNum(n= n/3);
    }
    
    
    public static void main(String[] args) {
		Solution sol = new Solution();
		
		
		int n = 45;
		
		System.out.println("답 : " + sol.solution(n));
	}
}