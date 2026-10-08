#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
    int n,m;
    cin>>n>>m;
    vector<pair<int,int>> arr(m);
    for(int i=0;i<m;i++){
        int lt,rt;
        cin>>lt>>rt;
        arr[i]={lt,rt};
    }
    sort(arr.begin(),arr.end(),greater<>());
    int leftlimit=1e9,c=0;

   for(auto[lt,rt] : arr){
    if(rt<=leftlimit){
        c++; leftlimit=lt;
    }
   }
   cout<<c<<endl;
}
