import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
    	BigInteger a1 = new BigInteger(a).add(new BigInteger(b));
        return a1.toString();
    }
}