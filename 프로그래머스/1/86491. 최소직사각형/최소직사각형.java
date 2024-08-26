class Solution {
    public int solution(int[][] sizes) {
        int maxx= 0;  
        int maxy= 0; 
        
        for (int[] size : sizes) {
            int x= Math.max(size[0], size[1]); //둘 중에 큰 값 가로길이
            int y= Math.min(size[0], size[1]); //둘 중에 작은 값을 세로길이로 두고,
            
            maxx = Math.max(maxx,x);  // 큰 값은 그대로 가로길이 최대값
            maxy = Math.max(maxy,y);  // 작은 값 중에 가장 큰 값이 세로길이가 될 때 값이 나온다
        }
        
        return maxx * maxy;  
    }
}