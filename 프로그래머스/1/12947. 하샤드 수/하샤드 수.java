class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String k = x+"";
        String arr[] =k.split("");
        int temp = 0;
        for(String z : arr) {
        	int abc =Integer.parseInt(z);
        	temp+=abc;
        }
        
        if(x%temp==0) {
        	answer=true;
        }
        

        
        return answer;
    }
}