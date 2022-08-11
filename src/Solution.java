public class Solution  {
	String hand;

	 public String solution(int[] numbers, String hand)  {
         this.hand = hand;
		 	String answer = "";
		 	
		 	int[] left = {0,0};
		 	int[] right = {2, 0};
		 	int[] mid = {1, -1};
		 	
		 	for(int n: numbers) {
		 		switch(n) {
		 		case 1 : 
		 			answer += "L";
		 			left[0] = 0;
		 			left[1] = 3;
		 			break;
		 		case 4 : 
		 			answer += "L";
		 			left[0] = 0;
		 			left[1] = 2;
		 			break;	
		 		case 7 : 
		 			answer += "L";
		 			left[0] = 0;
		 			left[1] = 1;
		 			break;	
		 		case 3 : 
		 			answer += "R";
		 			right[0] = 2;
		 			right[1] = 3;
		 			break;	
		 		case 6 : 
		 			answer += "R";
		 			right[0] = 2;
		 			right[1] = 2;
		 			break;	
		 		case 9 : 
		 			answer += "R";
		 			right[0] = 2;
		 			right[1] = 1;
		 			break;	
		 		case 2 : 
		 			mid[0] = 1;
		 			mid[1] = 3;
		 			answer += leftOrRight(left, right, mid); break;
		 		case 5 : 
		 			mid[0] = 1;
		 			mid[1] = 2;
		 			answer += leftOrRight(left, right, mid); break;
		 		case 8 : 
		 			mid[0] = 1;
		 			mid[1] = 1;
		 			answer += leftOrRight(left, right, mid); break;
		 		case 0 : 
		 			mid[0] = 1;
		 			mid[1] = 0;
		 			answer += leftOrRight(left, right, mid); break;
		 					 			
		 		}
		 	}
		 	return answer;
	}
	 
	 public String leftOrRight(int[] left, int[] right, int[] mid) {
		 int xLeft = Math.abs(mid[0] - left[0]);
		 int yLeft = Math.abs(mid[1] - left[1]);
		 int xRight = Math.abs(mid[0] - right[0]);
		 int yRight = Math.abs(mid[1] - right[1]);
		 
		 int ltLeng = xLeft * xLeft + yLeft * yLeft;
		 int rtLeng = xRight * xRight + yRight * yRight;
		 
		 if(ltLeng < rtLeng) {
			 left = mid;
			 return "L";
		 } else if(ltLeng > rtLeng) {
			 right = mid;
			 return "R";
		 } else {
			 if(hand.equals("left")) {
				 left = mid;
				 return "L";
			 } else {
				 right = mid;
				 return "R";
			 }
		 }
	 }
	
}




	



	

	
	



