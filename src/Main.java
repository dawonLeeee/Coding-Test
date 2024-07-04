
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

	}

	public int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();
		int start = 1;
		while(start <= elements.length) {
			for(int i = 0; i < elements.length; i++) {
				int value = 0;
				for(int j = i;j < i + start; j++) {
					value += elements[j % elements.length];
				}
				set.add(value);
			}
			start++;

		}
		return set.size();
	}
}
