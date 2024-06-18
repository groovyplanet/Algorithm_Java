import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {}; // 반환할 결과 배열

        if (n == 1) {
            // Case 1: num_list의 처음부터 slicer[1]까지 복사
            answer = Arrays.copyOfRange(num_list, 0, slicer[1]);
        } else if (n == 2) {
            // Case 2: num_list에서 slicer[0]부터 끝까지 복사
            answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
        } else if (n == 3) {
            // Case 3: num_list에서 slicer[0]부터 slicer[1]까지 복사
            answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]);
        } else if (n == 4) {
            // Case 4: num_list에서 slicer[0]부터 slicer[1]까지 slicer[2] 간격으로 복사
            List<Integer> tempList = new ArrayList<>();
            for (int i = slicer[0]; i < slicer[1]; i += slicer[2]) {
                tempList.add(num_list[i]);
            }
            // List를 배열로 변환
            answer = new int[tempList.size()];
            for (int i = 0; i < tempList.size(); i++) {
                answer[i] = tempList.get(i);
            }
        }

        return answer;
    }
}
