class Solution {
    public String solution(String s) {
       
        
        String [] x = s.split("");
        int y = x.length;
        String temp="";
        if(y%2==0){
            temp+=x[y/2-1];
            temp+=x[y/2];
        }else{
            temp+=x[y/2];
        }
        
        
        
        return temp;
    }
}