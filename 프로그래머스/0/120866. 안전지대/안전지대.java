class Solution {
    public int solution(int[][] board) {
      
        int n =board.length;
        int [][] k = new int [n+2][n+2];
        
        for(int i=1; i<n+1; i++) {
        	for(int j=1; j<n+1; j++) {
        		k[i][j]=board[i-1][j-1];
        	}
        }
        for(int i=1 ; i<n+1; i++) {
        	for(int j=1; j<n+1; j++) {
        		if(k[i][j]==1) {
        			for(int z=i-1; z<=i+1; z++) {
        				for(int q= j-1; q<=j+1; q++) {
        					if(k[z][q]!=1) {
        						k[z][q]=2;
        					}
        				}
        			}
        		}
        	}
        }
        int cnt=0;
        for(int i=1; i<n+1; i++) {
        	for(int j=1; j<n+1; j++) {
        		if(k[i][j]==0) {
        			cnt++;
        		}
        	}
        }

        return cnt;
    }
}