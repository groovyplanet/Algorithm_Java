class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String []x=control.split("");
        
        for(int i = 0; i<x.length; i++){
        	if(x[i].equals("w")){
                n++;
            }else if(x[i].equals("s")){
                n--;
            }else if(x[i].equals("d")){
                n+=10;
            }else if(x[i].equals("a")){
                n-=10;
            }
        }answer=n;    
        return answer;
    }
}