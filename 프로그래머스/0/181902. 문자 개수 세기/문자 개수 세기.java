class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int [] temp = new int [52];
        
        for(int i=0; i<my_string.length(); i++) {
        	char x = my_string.charAt(i);
        	if(x>='A' && x<='Z') {
        	temp[x-'a']=+1;
        	}else if(x>='a' && x<='z') {
        	temp[x-'a']=+1;
        	}
        }
        
        return answer;
    }
}