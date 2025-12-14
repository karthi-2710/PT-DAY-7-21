class DyCountStep {
    
    int helper(int n,int[] dp){
        if(n==1||n==2){
            return n;
            
        }
        if(dp[n]==-1){
            return dp[n]=helper(n-1,dp) + helper(n-2,dp);
        }else{
            return dp[n];
        }
    }
    
    
    
    int countWays(int n) {
        // your code here
      int[] dp=new int[n+1];
     Arrays.fill(dp,-1);
      return helper(n,dp);
    }
}