class Solution {
    public long solution(int price, int money, int count) {
        int sum = 0;

        
        
        long answer = (long)price * (count * (count+1) / 2) - money;
        if(answer <= 0) answer = 0;
        

        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution sol = new Solution();
		
		int price = 3;
		int money = 20;
		int count = 4;
		
		
		System.out.println(sol.solution(price, money, count));
    }
}