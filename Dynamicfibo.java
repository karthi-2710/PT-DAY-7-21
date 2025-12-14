/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Dynamicfibo
{
    
    public static int fib(int n,int[] dp){
        if(n==1 || n==2){
            return dp[n];
            
        }
        
        if(dp[n]==-1){
            dp[n]=fib(n-1,dp)+fib(n-2,dp);
        }else{
            return dp[n];
        }
        return dp[n];
    } 
	public static void main(String[] args) {
          int n=12;
          int[] dp=new int[n+1];
          Arrays.fill(dp,-1);
          dp[1]=0;
          dp[2]=1;
          int k=fib(12,dp);
          System.out.println(k);
	}
}                                                                                                                 
