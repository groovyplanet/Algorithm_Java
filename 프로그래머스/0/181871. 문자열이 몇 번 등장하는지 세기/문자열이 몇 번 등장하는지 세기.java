class Solution {
	   public static int solution(String myString, String pat) {
	        int result = 0;
	       int index = myString.indexOf(pat); // myString에서 pat의 인덱스를 찾음
	       
	       while(index!=-1) { // 일치하지 않으면 음수
	    	   result++;
	    	   index=myString.indexOf(pat,index+1); //일치하면 인덱스 1씩 늘리기
	       }
	       
	       return result;
	    }
	}