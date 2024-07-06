class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];
        int x=0;
        int y=0;

        	x=((numer1*denom2) +(numer2*denom1));
        	y=(denom1*denom2);

     
        answer[0]=x/gcd(x, y);
        answer[1]=y/gcd(x, y);

        return answer;
    }
    public static int gcd(int p, int q)
    {
   	if (q == 0) return p;
   	return gcd(q, p%q);
    }
}