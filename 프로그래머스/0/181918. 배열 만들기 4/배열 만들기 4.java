import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(list.size() == 0) { // list가 빈 배열이라면 arr[i]를 추가
                list.add(arr[i]);
            } else if(list.get(list.size() - 1) < arr[i]) { // list의 마지막 원소가 arr[i]보다 작으면 arr[i]를 추가
                list.add(arr[i]);
            } else { // list의 마지막 원소가 arr[i]보다 크거나 같으면 list의 마지막 원소를 제거
                list.remove(list.size() - 1);
                i--; // i를 감소시켜 현재 원소 arr[i]를 다시 비교하도록 함
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}