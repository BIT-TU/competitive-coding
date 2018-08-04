import java.util.*;
import java.math.BigInteger;

public class GCDMOD{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		long m = (long) 1e9 + 7;

		long t = in.nextInt();
		while(t-->0){
			long a = in.nextLong();
			long b = in.nextLong();
			long n = in.nextLong();
			long ab = a-b;
			long an = Maths.pow(a,n,m);
			long bn = Maths.pow(b,n,m);

			long anbn = Maths.mod(an+bn,m);
			System.out.println(a==b? ab : Maths.mod(Maths.gcd(anbn,ab),m));
		}
	}
}

class Maths {
	
	
	public static int add(int x, int y){
		return (y==0)?x:add(x^y,(x&y)<<1);
	}
	public static int sub(int x, int y){
		return (y==0)?x:sub(x^y,(~x&y)<<1);
	}
	public static int mult(int x, int y){
		return (y==1)?x:(mult(x,y>>1)<<1)+(((y&1)==1)?x:0);
	}
	public static int pow(int x, int y){
		return (y==0)?1:pow(x*x,y>>1)*(((y&1)==1)?x:1);
	}
	public static long pow(long x, long y,long m){
		return (y==0)?1:(pow((x*x)%m,y>>1,m)*(((y&1)==1)?x:1))%m;
	}
	public static int sqrt(int x, int lo, int hi){
		int mid = (lo+hi)/2;
		if(lo>hi) return mid;
		if(mid*mid==x) return mid;
		if(mid*mid<x) return sqrt(x,mid+1,hi);
		else return sqrt(x,lo,mid-1);
	}
	public static long mod(long a, long m){
		return Math.floorMod(a, m);
	}
	public static long gcd(long a, long b){
		return (a==0)?b:gcd(b%a,a);
	}
	// public static int gcd(int a, int b,int[] c){
	// 	if(a==0){
	// 		c[0]=0;
	// 		c[1]=1;
	// 		return b;
	// 	}
	// 	int g = gcd(b%a,a,c);
	// 	int x = c[1] - (b/a)*c[0];
	// 	int y = c[0];
		
	// 	c[0]=x;
	// 	c[1]=y;
	// 	return g;
	// }
	
	// public static int inv(int a, int m, boolean p){
	// 	if(!p){
	// 		int c[] = new int[2];
	// 		int g = gcd(a,m,c);
	// 		if(g==1) return mod(c[0],m);
	// 		else return Integer.MIN_VALUE;
	// 	}
	// 	else{
	// 		return pow(a,m-2,m);
	// 	}
	// }
	
	// public static int lcm(int a, int b){
	// 	return (a*b)/gcd(a,b);
	// }
	// public static long fact(int n){
	// 	long ans=1;
	// 	while(n>0)	ans*=n--;
	// 	return ans;
	// }
	// public static long fact(int n,int m){
	// 	long ans=1;
	// 	while(n>0)	ans = (ans*n--)%m;
	// 	return ans;
	// }
	// public static void fact(int fact[]){
	// 	fact[0]=1;
	// 	for(int i=1;i<fact.length;i++)
	// 		fact[i] = fact[i-1]*i;
	// }
	// public static void fact(int fact[],int p){
	// 	fact[0]=1;
	// 	for(int i=1;i<fact.length;i++)
	// 		fact[i] = (fact[i-1]*i)%p;
	// }
	// public static int crt(int n[], int r[]){
	// 	int p = 1;
	// 	for(int i=0;i<n.length;i++)
	// 		p*=n[i];
	
	// 	int res=0;
	// 	for(int i=0;i<n.length;i++){
	// 		int pp = p/n[i];
	// 		int pi = inv(pp,n[i],false);
	// 		res = res + (r[i]*pp*pi)%p;
			
	// 	}
	// 	return res%p;
	// }
	// public static int phi(int n){
	// 	int res = n;
	// 	for(int p=2;p*p<=n;p++){
	// 		if(n%p==0){
	// 			while (n%p==0) n/=p;
	// 			res = res - res/p;
	// 		}
	// 	}
	// 	if(n>1) res = res - res/n;
	// 	return res;
	// }
	// public static long nCr(int n, int r){
	// 	r = n-r>r ? r:n-r;
	// 	long res=1;
	// 	for(int i=1;i<=r;i++,n--){
	// 		res = (res*n)/i;
	// 	}
	// 	return res;
	// }
	// public static long nCrFermat(int n, int r, int p){
	// 	int f[] = new int[n+1];
	// 	fact(f,p);
	// 	System.out.println(Arrays.toString(f));
	// 	return (f[n]*(inv((f[n-r]*f[r])%p,p,true)))%p;
	// }
	// public static long nCrFermat(int n, int r, int p,int f[]){
	// 	System.out.println("2st call n-"+n+" r-"+r);
	// 	return r>n?0:(f[n]*(inv((f[n-r]*f[r])%p,p,true)))%p;
	// }
	// public static long nCrLucas(int n, int r, int p){
	// 	int f[] = new int[n+1];
	// 	fact(f,p);
	// 	long res=1;
	// 	while(n>0&&r>0){
	// 		int N = n%p;
	// 		int R = r%p;
	// 		n = n/p;
	// 		r = r/p;
	// 		res = nCrFermat(N, R, p,f);	 //or nCrDP(N, R, p)
	// 	}
	// 	return res;
	// }
	
	
}