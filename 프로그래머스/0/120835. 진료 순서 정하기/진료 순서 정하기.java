import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] arr = emergency.clone();
        
        Arrays.sort(arr);
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(arr[i], length - i);
        }

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = map.get(emergency[i]);
        }

        return result;
    }
}
