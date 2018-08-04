import java.util.*;

public class PROBLEMS{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int p =  in.nextInt();
		int s = in.nextInt();

		List<Pair> diff = new ArrayList<>();
		for(int t=1;t<=p;t++){
			List<Pair> st = new ArrayList<>();
			for(int i=0;i<s;i++)
				st.add(new Pair());
			for(int i=0;i<s;i++)
				st.get(i).sc = in.nextInt();
			for(int i=0;i<s;i++)
				st.get(i).sn = in.nextInt();
			Collections.sort(st);
			int n=0;
			for(int i=0;i<s-1;i++)
				if(st.get(i).sn>st.get(i+1).sn) n++;
			diff.add(new Pair(n,t));
		}
		Collections.sort(diff);
		for(int i=0;i<p;i++)
			System.out.println(diff.get(i).sn);
	}
}


class Pair implements Comparable<Pair>{
	int sc;
	int sn;

	public Pair(){

	}
	public Pair(int sc, int sn){
		this.sc = sc;
		this.sn = sn;
	}

	@Override
	public int compareTo(Pair o){
		return sc-o.sc;
	}
}