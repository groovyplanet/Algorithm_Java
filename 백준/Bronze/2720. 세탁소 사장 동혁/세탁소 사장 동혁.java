import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int q = 0;
        int d = 0;
        int n = 0;
        int p = 0;
        for(int i=0; i<x; i++) {
        	int y = scan.nextInt();
        	while(true) {
        		q=y/25;
        		d=(y%25)/10;
        		n=((y%25)%10)/5;
        		p=(((y%25)%10)%5)/1;
        		System.out.print(q+" "+d+" "+n+" "+p+"\n");
        		break;
        	}
	
        }
 
    }
}