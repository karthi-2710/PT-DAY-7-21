class Tiles {
    
      int helper(int n,int[] dp){
        
       
        if(n<=1){
            return 1;
        }
        if(dp[n]==-1){
          return  dp[n]= helper(n-1,dp) + helper(n-2,dp);
        }else{
            return dp[n];
        }
        
        
    }
    
    public int numberOfWays(int n) {
        // code here
       int[] dp=new int[n+1];
      
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
}