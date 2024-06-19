import java.util.*;
class Solution {
    public int solution(int[] arr) {
    	   int cnt = 0;
           while (true) {
               int[] x = Arrays.copyOf(arr, arr.length);
               for (int i = 0; i < arr.length; i++) {
                  if (arr[i] >= 50 && arr[i] % 2 == 0) {
                       x[i] = arr[i] / 2;
                 } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                       x[i] = arr[i] * 2 + 1;
                   }
               }
               
               if (Arrays.equals(arr, x)) {
                   break; 
               }
               
               arr = x;
               cnt++;
           }
           
           return cnt;
       }
   }