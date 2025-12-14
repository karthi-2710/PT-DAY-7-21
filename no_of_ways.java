// User function Template for Java

class no_of_ways {
    
    long helper(int n,long[] dp){
        
       
        if(n<=3){
            return 1;
        }
        if(dp[n]==-1){
          return  dp[n]= helper(n-1,dp) + helper(n-4,dp);
        }else{
            return dp[n];
        }
        
        
    }
    long arrangeTiles(int n) {
        // code here
        long[] dp=new long[n+1];
        
           Arrays.fill(dp,-1);
        return helper(n,dp);
    }
}