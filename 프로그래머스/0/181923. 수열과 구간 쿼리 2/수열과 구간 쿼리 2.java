import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List <Integer> list = new ArrayList<Integer>();

        for(int i=0 ; i<queries.length;i++) {
        	int x =queries[i][0];
        	int y =queries[i][1];
        	int z =queries[i][2];
            
            int temp = -1;
        	for(int j=x; j<=y; j++) {
        		if(arr[j]>z) {
                    if(temp==-1 || arr[j] <temp){
                        temp=arr[j];
                    }
        		}
        		}
            list.add(temp);

        	}
        return list.stream().mapToInt(Integer::intValue).toArray();

        }
   
    }
