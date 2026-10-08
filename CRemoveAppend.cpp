#include<iostream>
#include<vector>
#include<map>
using namespace std;
int main(){
  int n,q; cin>>n>>q;
  vector<int> pos(n+1);
  for(int i=1;i<=n;i++){
    int curr; cin>>curr;
    pos[curr]=i;// curr is at i position so...
}
int nextpos=n+1;
  while(q--!=0){
    int val; cin>>val;
    pos[val]=nextpos++;
}
vector<pair<int,int>> arr;
for(int val=1;val<=n;val++){
  arr.push_back(make_pair(pos[val],val));
}
sort(arr.begin(),arr.end());
for(auto[pos,val]:arr){
  cout<<val+" ";
}
cout<<endl;

}
