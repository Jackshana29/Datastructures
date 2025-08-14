package coin;
import java.util.*;
public class CoinBruteForceMethod {

	    public static int minCoin(int n,int a[]) {
	    if(n==0) return 0;
	    int res=Integer.MAX_VALUE;
	    for(int i=0;i<a.length;i++) {
	        if(a[i]<=n) {
	            int subRes=minCoin(n-a[i],a);
	            if(subRes!=Integer.MAX_VALUE) {
	                res=Math.min(res, subRes+1);
	            }
	        }
	    }return res;
	}

	    public static void main(String[] args) {
	        Scanner sc=new Scanner (System.in);
	        int n=sc.nextInt();
	        int a[]= {9,6,5,1};
	        System.out.print(minCoin(n,a));

	    }

	}

