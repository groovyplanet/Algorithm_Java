class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        
        int i=0;
        
        while(true) {
        	int x= i;
        	int cnt = 0;
        	int sum=0;
        	int j=0;
        	
        	while(cnt<num) {
        		sum+=x;
        		answer[j++]=x;
        		x++;
        		cnt++;
        		
        	}
        	if(sum==total) {
        		return answer;
        	}else {
        		if(sum<total) {
        			i++;
        		}
        		if(sum>total) {
        			i--;
        		}
        		
        		
        	}
        	
        	
        
        	
        }

        }
        
    }
