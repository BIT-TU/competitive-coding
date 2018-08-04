import java.util.*;

public class SPELLBOB{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0){
			char t[] = in.next().toCharArray();
			char b[] = in.next().toCharArray();
			int s[][] = new int[3][255];

			s[0][t[0]]=1;
			s[0][b[0]]=1;
			s[1][t[1]]=1;
			s[1][b[1]]=1;
			s[2][t[2]]=1;
			s[2][b[2]]=1;

			System.out.println(funny(s));

		}
	}
	public static String funny(int s[][]){
		if(s[0]['o']==1 && s[1]['b']==1 && s[2]['b']==1) return "yes";
		if(s[1]['o']==1 && s[0]['b']==1 && s[2]['b']==1) return "yes";
		if(s[2]['o']==1 && s[0]['b']==1 && s[1]['b']==1) return "yes";
		return "no";
	}

}