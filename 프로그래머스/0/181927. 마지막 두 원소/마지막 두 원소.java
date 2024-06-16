public class Solution {
    public int[] solution(int[] num_list) {
    int last = num_list[num_list.length - 1];
    int prev = num_list[num_list.length - 2];
    
    int addNum = (last > prev) ? (last - prev) : (last * 2);
    
    int[] result = new int[num_list.length + 1];
    System.arraycopy(num_list, 0, result, 0, num_list.length);
    result[num_list.length] = addNum;
    
    return result;
}
}
