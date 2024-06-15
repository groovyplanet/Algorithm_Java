class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int bill = 0;
        int ser = 0;
        
       bill+=(12000*n)+(2000*k);
           ser+=(n/10)*2000;
               answer+=bill-ser;
        
        return answer;
    }
}