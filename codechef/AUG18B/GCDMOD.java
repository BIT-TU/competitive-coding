import java.util.*;
import java.math.BigInteger;

public class GCDMOD{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		long m = (long)1e9+7;
		BigInteger M = BigInteger.valueOf(m);
		//System.out.println(M.intValue());
		int t = in.nextInt();
		while(t-->0){
			long a = in.nextLong();
			long b = in.nextLong();
			long n = in.nextLong();
			BigInteger A = BigInteger.valueOf(a);
			BigInteger B = BigInteger.valueOf(b);
			BigInteger N = BigInteger.valueOf(n);
			if(a-b==0){
				System.out.println(A.modPow(N,M).add(B.modPow(N,M)).mod(M).intValue());
				continue;
			}
			long ans = 0;
			for(long i=1;i*i<=a-b;i++){
				if((a-b)%i==0){
					if( A.modPow(N,BigInteger.valueOf(i)).add(B.modPow(N,BigInteger.valueOf(i))).mod(BigInteger.valueOf(i)).compareTo(BigInteger.valueOf(0)) == 0) ans = Math.max(ans,i);
					if( A.modPow(N,BigInteger.valueOf(((a-b)/i))).add(B.modPow(N,BigInteger.valueOf(((a-b)/i)))).mod(BigInteger.valueOf(((a-b)/i))).compareTo(BigInteger.valueOf(0)) == 0) ans = Math.max(ans,(a-b)/i);
				}
			}

			System.out.println(ans%m);
		}
	}
}

 