class ncr {
    
    int helper(int n,int r,int[][] dp){
        
        if(r>n){
            return 0;
        }
        if(r==0 || n==r){
            return 1;
        }
        if(dp[n][r]==-1){
          return  dp[n][r]= helper(n-1,r,dp) + helper(n-1,r-1,dp);
        }else{
            return dp[n][r];
        }
        
        
    }
    public int nCr(int n, int r) {
        // code here
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++)
           Arrays.fill(dp[i],-1);
        return helper(n,r,dp);
    }
}


// class Solution { tabulation
    
  
//     public int nCr(int n, int r) {
//         // code here
//         int[][] dp=new int[n+1][r+1];
//       for(int i=0;i<=n;i++){
//           for(int j=0;j<=r;j++){
//               if(i==j|| j==0){
//                   dp[i][j]=1;
//               }else if(j>i){
//                   dp[i][j]=0;
//               }else{
//                   dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
//               }
//           }
//       }
//       return dp[n][r];
//     }
// }