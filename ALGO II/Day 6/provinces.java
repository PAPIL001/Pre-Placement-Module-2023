class Solution {
    
    public int findCircleNum(int[][] arr) {
        
        int  n = arr.length;
        
        int par[] = new int[n];
        int rank[] = new int[n];
        
        int count  = n;
        
        for(int i=0; i<n; i++)
            par[i] = i;
        
        for(int i=0; i<n; i++){
           for(int j=0; j<n;j++){
               if(i != j && arr[i][j] == 1){
                   int u = findPar(i,par);
                   int v = findPar(j,par);
                   
                   if(u != v){
                       count--;
                       union(u,v,par,rank);
                   }
               }
           }
        }
        
        return count;
    }
    
    public int findPar(int node, int[] par){   
        return par[node] == node ? node : (par[node] = findPar(par[node],par));    
    }
    
    public void union( int u, int v, int[] par, int[] rank){
           if(rank[v] > rank[u]){
                par[u] = v;
                rank[v]++;
            }
            else{
                par[v] = u;
                rank[u]++;
            }
    }
    
}