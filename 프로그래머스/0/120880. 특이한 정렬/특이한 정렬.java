import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] numArray = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(numArray, (a, b) -> {// Comparator의 compare 메서드를 람다식으로 구현 (a,b) 
            //compare 메서드는 람다식 내의 조건에 따라 a와 b의 순서를 결정하고, 이에 따라서 정렬함
            int distanceA = Math.abs(a - n); // 절대값으로 거리를 구함
            int distanceB = Math.abs(b - n); // 절대값으로 거리를 구함

            if (distanceA == distanceB) {
                return b - a; // 거리가 같을 때는 더 큰 수를 앞에
            } else {
                return distanceA - distanceB; // 거리에 따라 오름차순 정렬
            }
        });
        return Arrays.stream(numArray).mapToInt(Integer::intValue).toArray();
      }
}
//단순히 과정에 대한 이해로 접근하기보다는 , compare의 역할에 대해서 단순하게 이해하면 쉽다.
//compare = 두 수의 대소비교 후 정렬 , 람다식 = 반복 >> 반복과정의 compare로 대소정렬로 이해하면 식 이해가 쉽다.