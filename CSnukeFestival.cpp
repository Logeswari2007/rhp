#include<iostream>
#include<algorithm>
#include<vector>
#define ll long long int
using namespace std;
void getinput(vector<int>& arr,int n){
    for(int i=0;i<n;i++){
        cin>>arr[i];
        sort(arr.begin(),arr.end());
    }

}
int main(){
    int n; cin>>n;
    vector<int> up(n),mid(n),low(n);
    getinput(up,n);
    getinput(mid,n);
    getinput(low,n);
    vector<ll> pm(n),pu(n);
    for(int i=0;i<n;i++){
        auto it=upper_bound(low.begin(),low.end(),mid[i]);
        if(it!=low.end()){
            pm[i]=low.end()-it;
        }
    }
    for(int i=0;i<n;i++) pm[i]-=pm[i-1];
    ll ans=0;
    for(int i=0;i<n;i++){
        auto it=upper_bound(mid.begin(),mid.end(),up[i]);
        if(it!=mid.end()){
           int midx=it-mid.begin();
			ans+=pm[n-1]-(midx==0?0:pm[midx-1]);
        }
    }
cout<<ans<<endl;

}