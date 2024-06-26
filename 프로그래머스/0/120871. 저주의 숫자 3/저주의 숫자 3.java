class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int [101];
        int cnt=0;
       for(int i = 1 ;cnt<n; i++) {
    	   if(i%3==0 || String.valueOf(i).contains("3")) {
           	continue;
           }
    	   cnt++;
    	   arr[cnt]=i;
    	   if(cnt==n) {
    		   answer=i;
    		   break;
    	   }
    	   
    	   
       }

        return answer;
    }
}