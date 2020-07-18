#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main() {
    ll t;
    cin >> t;
    while(t--) {
        ll n, k;
        cin >> n >> k;
        ll a[n];
        for(ll i=0;i<n;++i) {
            cin >> a[i];
        }
        sort(a,a+n);
        ll ans = 0;
        for(ll i=0;i<n;++i) {
            ans+=a[i];
            n-=k;
        }
        cout << ans << "\n";
    }   
}
