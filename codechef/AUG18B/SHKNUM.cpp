#include<bits/stdc++.h>
using namespace std;

int main(){
	int t,n;
	cin>>t;
	while(t-->0){
		cin>>n;
		if(n==1){cout<<2<<endl; continue;}

		float lgn = log2(n);
		int lgnC = ceil(lgn);
		int lgnF = floor(lgn);

		int p1C = pow(2,lgnC);
		int p1F = pow(2,lgnF);

		if(n-p1C==0 || n-p1F==0){ cout<<1<<endl; continue;}
		
		float lgdFn = log2(abs(n-p1F));

		int lgdFnC = ceil(log2(abs(n-p1F)));
		int lgdFnF = floor(log2(abs(n-p1F)));

		int p2FnC = pow(2,lgdFnC);
		int p2FnF = pow(2,lgdFnF);

		int min_val = INT_MAX;
		if(p1F!=p2FnF) min_val = min(min_val, abs(n-(p1F+p2FnF)));
		if(p1F!=p2FnC) min_val = min(min_val, abs(n-(p1F+p2FnC)));


		min_val = min(p1C-n+1,min_val);
		cout<<(min_val)<<endl;
	}
}