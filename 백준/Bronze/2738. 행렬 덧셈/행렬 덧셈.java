import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int [][] answer= new int [a][b];
        int [][] answer2= new int [a][b];
        int result = 0;
        for(int i=0; i<a; i++) {
        	for(int j=0; j<b; j++) {
        		int x = scan.nextInt();
        		answer[i][j]=x;

        	}
        }
        
        for(int i=0; i<a; i++) {
        	for(int j=0; j<b; j++) {
        		int y = scan.nextInt();
        		answer2[i][j]=y;

        	}
        }
        
        for(int i=0; i<a; i++) {
        	for(int j=0; j<b; j++) {        		
        	result=answer[i][j]+answer2[i][j];
        	System.out.print(result+" ");
        	}
        	System.out.println("");
        }
   
    }
}