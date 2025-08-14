package coin;
import java.util.Arrays;
public class Coins_Memorization {
	
	public static int minCoins(int v,int[] coins,int[]dp) {
	    if(v==0) return 0;
	    if(dp[v]!=-1) return dp[v];
	    int res=Integer.MAX_VALUE;
	    for(int coin:coins){
	        if(coin<=v) {
	            int subres=minCoins(v-coin,coins,dp);
	            if(subres != Integer.MAX_VALUE) {
	                res=Math.min(res, subres+1);
	            }
	        }
	    }
	    dp[v]=res;
	    return dp[v];
	}
	    public static void main(String[] args) {
	        int[] coins= {9,5,6,1};
	        int v=56;
	        int[] dp=new int[v+1];
	        Arrays.fill(dp,-1);
	        System.out.println(minCoins(v,coins,dp));
	    }

	}

