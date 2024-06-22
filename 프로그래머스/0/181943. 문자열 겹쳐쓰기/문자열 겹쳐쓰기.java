class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
       String st =my_string.substring(0,s);
        st+=overwrite_string;
        st+=my_string.substring(overwrite_string.length()+s,my_string.length());
        return st;
    }
}