import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{

		
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		String y = scan.next();
		StringBuilder sb= new StringBuilder(x);
		StringBuilder sb1= new StringBuilder(y);
		
		String rex = sb.reverse().toString();
		String rey = sb1.reverse().toString();
		
		int a=Integer.parseInt(rex);
		int b=Integer.parseInt(rey);
		
		if(a>b) {
			System.out.println(a);
		}else if(a<b) {
			System.out.println(b);
		}
		
		
		
		
		
	}
	
}