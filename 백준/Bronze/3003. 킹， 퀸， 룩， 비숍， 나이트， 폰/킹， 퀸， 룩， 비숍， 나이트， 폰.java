import java.util.Scanner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int q = scan.nextInt();
		int l = scan.nextInt();
		int b = scan.nextInt();
		int n = scan.nextInt();
		int p = scan.nextInt();
		
		int x = 0;
		int y = 0;
		int z = 0;
		int r = 0;
		int w = 0;
		int e = 0;
		
		if(k!=1) {
			x = 1 -k;  
		}
		if(q!=1) {
			y = 1 -q;  
		}
		if(l!=2) {
			z = 2 -l;  
		}
		if(b!=2) {
			r = 2 -b;  
		}
		if(n!=2) {
			w = 2 -n;  
		}
		if(p!=8) {
			e = 8 -p;  
		}
		
		System.out.println(x+" "+y+" "+z+" "+r+" "+w+" "+e);
	}
	}