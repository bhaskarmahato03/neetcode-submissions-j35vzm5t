class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Queue<int[]> queue =new LinkedList<>();
        int fresh=0;
    
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j,0});
                }
                else{
                    if(grid[i][j]==1){
                        fresh+=1;
                    }
                }
            }
        }

        int time=0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};


        while(!queue.isEmpty()){
            int[]curr= queue.poll();
            int r= curr[0];
            int c=curr[1];
            int t= curr[2];

            time=Math.max(time,t);

            for (int[] dir : directions){
                int nr=r+dir[0];
                int nc=c+dir[1];

                if(nr>=0 && nr<row && nc>=0 && nc< col && grid[nr][nc]==1 ){
                    grid[nr][nc]=2;
                    fresh--;
                    queue.offer(new int[]{nr,nc,t+1});
                }
            }

        }
        if (fresh == 0) {
            return time;
        } else {
             return -1;
        }


        
    }
   

    
}
