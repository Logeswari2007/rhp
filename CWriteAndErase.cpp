#include<iostream>
#include<map>
using namespace std;
int main(){
    int n; cin>>n;
    Map<int,int> m;
    for(int i=0;i<n;i++){
        int curr; cin>>curr;
        m[curr]++;
    }
    int ans=0;
    for(auto[num,cnt]:m){
        if(cnt&1){
            ans++;
        }
    }
    cout<<ans<<endl;
}