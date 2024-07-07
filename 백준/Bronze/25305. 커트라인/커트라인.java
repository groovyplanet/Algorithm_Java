import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List <Integer>list = new ArrayList<Integer>();
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int gift = Integer.parseInt(input[1]);
		
		String[] x = br.readLine().split(" ");
		
		for(String k : x) {
			int b = Integer.parseInt(k);
			list.add(b);
		}
		
		Collections.sort(list,Collections.reverseOrder());

		
		System.out.println(list.get(gift-1));

	}


}