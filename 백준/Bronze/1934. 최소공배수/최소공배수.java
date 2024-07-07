import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List <Integer>list = new ArrayList<Integer>();
		int k = Integer.parseInt(br.readLine());
		for(int z = 0; z<k; z++) {
			String[] x = br.readLine().split(" ");
			System.out.println(lcm(Integer.parseInt(x[0]),Integer.parseInt(x[1])));
		}

	}
	public static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
