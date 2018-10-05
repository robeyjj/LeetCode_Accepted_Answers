class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowLargest = new int[grid.length];
        int[] columnLargest = new int[grid[0].length];
        int totalIncrease = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++) {
                if(rowLargest[i] < grid[i][j]) { 
                    rowLargest[i] = grid[i][j];
                }
                if(columnLargest[j] < grid[i][j]) { 
                    columnLargest[j] = grid[i][j];
                }
            }
        }        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                totalIncrease += Math.min(rowLargest[i],columnLargest[j]) - grid[i][j];
            }
        }
        return totalIncrease;
    }
}