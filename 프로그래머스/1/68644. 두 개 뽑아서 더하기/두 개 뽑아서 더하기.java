
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                 list.add(numbers[j]+numbers[i]);
            }
        }
        int[] temp =list.stream().distinct().collect(Collectors.toList()).stream().mapToInt(Integer::intValue)
                .toArray();

       Arrays.sort(temp);
        
        return temp;
    }
}