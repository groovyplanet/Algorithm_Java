import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        
        // indices 배열을 역순으로 정렬하여 뒤에서부터 제거해야 인덱스 문제가 발생하지 않습니다.
        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            int index = indices[i];
            sb.deleteCharAt(index);
        }
        
        return sb.toString();
    }
}
