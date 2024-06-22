class Solution {
    public int solution(int balls, int share) {
        return method(balls,share);
    }
    
    public static int method(int balls, int share){
        if(balls==share || share ==0) return 1;
        return method((balls-1),(share-1)) + method(balls -1 , share);
    }
 
}