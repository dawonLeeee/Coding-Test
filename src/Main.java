import javax.sound.sampled.EnumControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

		solution(name,yearning,photo);



	}

	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		Map<String, Integer> memberScore = new HashMap<>();
		for(int i = 0; i < name.length; i++){
			memberScore.put(name[i], yearning[i]);
		}

		int[] answer = new int[photo.length];
		for(int i = 0; i < photo.length; i++){
			int sum = 0;
			for(int j = 0; j < photo[i].length; j++){
				sum += memberScore.get(photo[i][j]) == null ? 0 : memberScore.get(photo[i][j]);
			}
			answer[i] = sum;
		}
		return answer;
	}
}
