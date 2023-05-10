import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int num = sc.nextInt()/4;
		while(num--> 0){
			sb.append("long ");
		}
		sb.append("int");
		System.out.println(sb);
	}
}