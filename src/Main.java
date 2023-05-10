import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		/*
		* 온점을 기준으로 문자열을 나눈다
		* sb에서 문자를 하나씰 읽으며 (), []가 들어오면 배열에 담는다
		* (다음 )가 왔을때/ [다음 ]가 왔을 때 pop으로 2개를 꺼낸다
		* 그러지 않으면 sb를 읽는 걸 중단하고 no 반환
		* 문장이 끝날때까지 배열의 size() != 0이어도 no 반환
		* */

		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<String> stack = new Stack<>();
//		while(true){
			String result = "yes";
			while(true){
				String str = br.readLine();
				System.out.println(str);
				if(str.equals(".")) {
					System.out.println("asdfas");
					break;
				}

				if(str.equals("(") || str.equals("[")){
					stack.push(str);
				}
				if(str.equals(")") || str.equals("]")){
					if(str.equals(")")){
						if(stack.peek().equals("(")){
							stack.pop();
						} else {
							result = "no";
							break;
						}
					}
					if(str.equals("]")){
						if(stack.peek().equals("]")){
							stack.pop();
						} else {
							result = "no";
							break;
						}
					}
					else {
						result = "no";
						break;
					}
				}
			}
			System.out.println(result);
//		}
	}
}




	



	

	
	



