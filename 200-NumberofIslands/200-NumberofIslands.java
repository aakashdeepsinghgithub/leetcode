// Last updated: 6/21/2025, 6:24:55 PM
class Solution {

    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(); 
    
    public void callBFS(char[][] grid , int i, int j){ 

        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') return;

        grid[i][j]='0';
        callBFS(grid ,i+1,j);
        callBFS(grid ,i-1,j);
        callBFS(grid ,i,j+1);
        callBFS(grid ,i,j-1);
    }

    
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0 ; i<grid.length ; i++ ){ 
            for(int j=0 ; j<grid[i].length ; j++){ 

                if(grid[i][j] == '1'){ 
                    count++;
                    callBFS(grid,i,j);
                }
            }
        }
        return count;
    }

}