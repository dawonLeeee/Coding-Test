public class Main  {
	String hand;

	 public String solution(int[] numbers, String hand)  {
         this.hand = hand;
		 	String answer = "";
		 	
		 	int left = 10, right = 12;;
		 	
		 	for(int n: numbers) {
		 		switch(n) {
				 	case 1 : case 4 : case 7 : 
				 		answer += "L"; left = n; break;
				 	case 3 : case 6 : case 9 : 
				 		answer += "R"; right = n - 2; break;
				 	case 2 : case 5 : case 8 : 
				 		answer += leftOrRight(left, right, n); break;
				 	case 0 :	
				 		answer += leftOrRight(right, left, n); break;
		 		}
		 	}
		 	return answer;
	}
	 
	 public String leftOrRight(int left, int right, int n) {
		 if(Math.abs(n-left) < Math.abs(n-right)) {
			 left = n;
			 return "L";
		 }
		 else if(left > right) {
			 right = n;
			 return "R";
	 	}
		 else {	 // left == right
			 if(hand.equals("right")) {
				 right = n;
				 return "R";
			 } else {
				 left = n;
				 return "L";
			 }
		 }
	 }
	
}




	



	

	
	



