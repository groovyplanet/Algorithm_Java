class Solution {
    public int[] solution(int n) {
        
        int x = 0;
            
        for(int i = 1 ; i<=n; i++){
            if(i%2!=0){
                x++;
            }
        }
        int[] answer = new int [x];
        int index =0;
        for(int j=1; j<=n; j++){
            if(j%2!=0){
                answer[index]=j;
                index++;
                
                }
            }
        
        return answer;
        }
        
        
        
    }
