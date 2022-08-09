import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


class Time implements Comparable<Time> {
	int start;
	int end;
	Time(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public int compareTo(Time t) {
		if(this.end == t.end)
			return this.start - t.start;
		return this.end - t.end;
	}
}


public class Main  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Time> timeList = new ArrayList<>();
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			timeList.add(new Time(a, b));
		}
		
		Collections.sort(timeList);
		
		int ans = 1;
		int endTime = timeList.get(0).end;
		for(int i = 1; i < timeList.size(); i++) {
			if(timeList.get(i).start >= endTime) {
				endTime = timeList.get(i).end;
				ans++;
			}
		}
		System.out.println(ans);
	}
}
	
	



