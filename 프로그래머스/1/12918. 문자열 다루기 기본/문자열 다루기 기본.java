class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        String[] x = s.split(""); 
        int k = x.length;

        if (k != 4 && k != 6) {
            return false;
        }

        for (int i = 0; i < k; i++) {
            try {
                int num = Integer.parseInt(x[i]); 
                if (0 <= num && num <= 9) {
                    continue;
                } else {

                    answer = false;
                    break;
                }
            } catch (NumberFormatException e) {

                answer = false;
                break;
            }
        }

        return answer;
    }
}
