class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int area= 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if (grid[i][j] == 1){
                    int crr = dfs(grid, i, j);
                    area = Math.max(area, crr);
                }
            }
        }
        return area;
    }

    public static int dfs(int [][] grid, int i, int j){
        if(i<0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return 1 + dfs(grid, i-1, j)
                 + dfs(grid, i+1, j)
                 + dfs(grid, i, j-1)
                 + dfs(grid, i, j+1);
    }

    public static int bfs(int [][]grid, int i, int j){
        int area = 0;
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{i, j});
        grid[i][j] = 0;
        area++;
        int [][] direction = new int[][]{{-1,0}, {1,0}, {0,-1}, {0,1}};
        while(!que.isEmpty()){
            int [] crr = que.poll();
            int r = crr[0];
            int c = crr[1];
            for(int [] dir: direction){
                int nextR =r + dir[0];
                int nextC = c + dir[1];

                if (nextR >= 0 && nextC >= 0 && nextR < grid.length && nextC < grid[0].length && grid[nextR][nextC] == 1) {
                    grid[nextR][nextC] = 0; 
                    area++;                 
                    que.offer(new int[]{nextR, nextC}); 
                }
            }
        }
        return area;
    }
}
