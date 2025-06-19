// Last updated: 6/19/2025, 9:56:58 PM
class Solution {

    public static void dfs(int node , ArrayList<ArrayList<Integer>> adj,boolean[] visited){ 
        
        visited[node]=true;
        for(int i : adj.get(node)){ 
            if(!visited[i]){ 
                dfs(i,adj,visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int V = isConnected.length;
        for(int i=0 ; i<V ;i++){ 
            adj.add(new ArrayList<Integer>());
        }

        for(int j = 0 ; j<V ; j++){ 
            for(int k=0 ; k<V ;k++){ 
                if(isConnected[j][k] == 1 && k!=j){ 
                    adj.get(j).add(k);
                    adj.get(k).add(j);
                }
            }
        }
        int count=0;
        boolean[] visited = new boolean[V];
        for(int i=0 ; i<V ; i++){ 
            if(!visited[i]){ 
                count++;
                dfs(i,adj,visited);
            }
        }


    return count;    
    }
}