import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                list.add(i);
                if (i != a / i) {
                    list.add(a / i);
                }
            }
        }
        
        list.sort(Integer::compareTo);
        
        if (b <= list.size()) {
            System.out.println(list.get(b - 1));
        } else {
            System.out.println(0);
        }
    }
}
