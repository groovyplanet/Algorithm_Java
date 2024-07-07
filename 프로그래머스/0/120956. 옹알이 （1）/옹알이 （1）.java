class Solution {
    public int solution(String[] babbling) {
        int magnetic = 0;
        String[] horseking = {"aya", "ye", "woo", "ma"};
        for (String you : babbling) {
            for(String illit : horseking) {
                you = you.replace(illit, " ");
            }
            if (you.replaceAll(" ", "").equals("")) {
                magnetic++;
            }
                }
        return magnetic;
    }
}