class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] x = quiz[i].split(" ");
            int z = Integer.parseInt(x[0]);
            int h = Integer.parseInt(x[2]);
            int f = Integer.parseInt(x[4]);

            if (x[1].equals("-") && f == z - h) {
                answer[i] = "O";
            } else if (x[1].equals("+") && f == z + h) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}
