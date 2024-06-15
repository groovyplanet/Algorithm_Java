import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        
     
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
      
        for (String pattern : croatian) {
            x = x.replace(pattern, " ");
        }
        
 
        System.out.println(x.length());
    }
}