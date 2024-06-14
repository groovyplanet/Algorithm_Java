class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min=0;
        int k =101;
        for(int i=0; i<array.length; i++) {
        	int z =Math.abs(n-array[i]);
        	if(k>z) {
        		k=z;
        		min=i;
            }else if (k == z && array[i] < array[min]){
                min=i;
            }
            
        	
        }
        answer=array[min];
 
        return answer;
}
    }