class Solution {
    public int solution(double price) {
        int answer = 0;
        double temp = 0;
        if(500000<=price){
            temp=price*0.8;
        }else if(300000<=price){
            temp=price*0.9;}
        else if(100000<=price){
            temp=price*0.95;}
        else{
            temp=price;
            
        }
        
            
        
        answer+=temp;
        
        return answer;
    }
}