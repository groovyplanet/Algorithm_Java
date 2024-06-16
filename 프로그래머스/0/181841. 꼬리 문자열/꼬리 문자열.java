class Solution {
    public StringBuffer solution(String[] str_list, String ex) {
        StringBuffer answer = new StringBuffer("");
        
        for(int i = 0; i<str_list.length; i++){
            String x =str_list[i];
            if(x.indexOf(ex)<0){
                answer.append(x);
                
            }
        }
        
        return answer;
    }
}