import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            int x = scan.nextInt();
            if (x == -1) {
                break;
            }
            
            int sum = 0;
            List<Integer> list = new ArrayList<>();

            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            if (sum == x) {
                System.out.print(x + " = ");
                for (int j = 0; j < list.size(); j++) {
                    if (j > 0) {
                        System.out.print(" + ");
                    }
                    System.out.print(list.get(j));
                }
                System.out.println(); 
            } else {
                System.out.println(x + " is NOT perfect.");
            }
        }

    }
}