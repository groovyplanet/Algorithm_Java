class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int x =Math.max(sides[0], sides[1]);
        int y = Math.min(sides[0], sides[1]);
        return (x+y)-(x-y)-1;
    }
}