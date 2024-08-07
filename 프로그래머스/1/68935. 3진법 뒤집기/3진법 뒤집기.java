class Solution {
    public int solution(int n) {    
        String k =Integer.toString(n,3);
        String sb = new StringBuilder(k).reverse().toString();
        int answer = Integer.parseInt( sb,3);
        return answer;
    }
}