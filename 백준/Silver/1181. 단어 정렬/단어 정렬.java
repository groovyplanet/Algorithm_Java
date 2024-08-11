import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Set<String> set = new TreeSet<>((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2); // 길이가 같을 때 , 사전순 비교
            } else {
                return Integer.compare(o1.length(), o2.length()); // 길이가 다를때 길이로 비교
            }
        });

       
        for (int i = 0; i < num; i++) {
            set.add(br.readLine());
        }

        for (String word : set) {
            System.out.println(word);
        }
    }
}
