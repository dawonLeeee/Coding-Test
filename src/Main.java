import javax.sound.sampled.EnumControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		solution("pPoooyY");
	}

	public static boolean solution(String s) {
		String[] arr = s.toLowerCase().split("");
		int plsMns = 0;
		for(int i = 0; i < arr.length; i++){
			if("p".equals(arr[i])) plsMns++;
			else if("y".equals(arr[i])) plsMns--;
		}
		System.out.println(plsMns);
		if(plsMns == 0) return true;
		else return false;

	}
}
