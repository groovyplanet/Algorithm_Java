class Solution {
    public int solution(String my_string, String target) {
        int x=my_string.indexOf(target);
        return x<0? 0:1;
    }
}