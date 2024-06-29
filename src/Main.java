
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

	}

	public int solution(int[] priorities, int location) {
		Queue<Integer> pQ = new LinkedList<>();
		Queue<Character> charQue = new LinkedList<>();
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < priorities.length; i++) {
			charQue.offer((char) ('a' + i));
			pQ.offer(priorities[i]);
			priorityQueue.offer(priorities[i]);
		}
		char target = (char) ('a' + location);
		int answer = 0;
		while(!pQ.isEmpty()) {
			int p = pQ.poll();
			int max = priorityQueue.peek();
			char thisTarget = charQue.poll();
			if(p == max) {
				priorityQueue.poll();
				answer++;
				if(target == thisTarget) {
					return answer;
				}
			} else {
				pQ.offer(p);
				charQue.offer(thisTarget);
			}
		}
		return 0;
	}
}
