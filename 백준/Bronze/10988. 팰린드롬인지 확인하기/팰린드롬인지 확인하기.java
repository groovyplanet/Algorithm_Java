import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	


		Scanner scan = new Scanner(System.in);
		String k = scan.next();
		StringBuilder sb= new StringBuilder(k);

		if(k.contains(sb.reverse())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}
		}