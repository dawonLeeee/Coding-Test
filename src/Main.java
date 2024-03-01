import javax.sound.sampled.EnumControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		String[] survey = {"TR", "RT", "TR"};
		int[] choices = {7,1,3};
		System.out.println(solution(survey, choices));




	}

	public static String solution(String[] survey, int[] choices) {
		String answer = "";
		int rt = 0;
		int cf = 0;
		int jm = 0;
		int an = 0;
		for(int i = 0; i < survey.length; i++) {
			int type = 0;
			if(survey[i].contains("R")) {
				rt += (survey[i].indexOf("R")==0? 1:-1) * (choices[i]-4);
			}
			else if(survey[i].contains("C")) {
				cf += (survey[i].indexOf("C")==0? 1:-1) * (choices[i]-4);
			}
			else if(survey[i].contains("J")) {
				jm += (survey[i].indexOf("J")==0? 1:-1) * (choices[i]-4);
			}
			else if(survey[i].contains("A")) {
				an += (survey[i].indexOf("A")==0? 1:-1) * (choices[i]-4);
			}
		}

		return (rt>0?"T":"R") + (cf>0?"F":"C") + (jm>0?"M":"J") + (an>0?"N":"A");
	}
}
