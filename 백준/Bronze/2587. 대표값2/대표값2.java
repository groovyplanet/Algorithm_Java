import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List <Integer>list = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0; i<5; i++) {
			int x = Integer.parseInt(br.readLine());
			list.add(x);
			sum+=x;
		}
		Collections.sort(list);
		int m = list.get(2);
		int avg = sum/5;
		
		System.out.println(avg);
		System.out.println(m);

	}


}