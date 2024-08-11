

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pl= p.length();
        Long x = Long.parseLong(p);
        for(int i=0; i<= t.length()-pl; i++){
            String a =t.substring(i,i+pl);
            Long o =  Long.parseLong(a);

            if(o<=x){
                answer++;
            }
        }

        return answer;
    }
}