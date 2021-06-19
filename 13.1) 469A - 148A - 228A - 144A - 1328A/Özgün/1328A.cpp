#include <bits/stdc++.h>

using namespace std;

int main() {
    int t, a;
    double b;
    
    cin >> t;

    while (t--) {
        cin >> a >> b;
        cout << (long long) (ceil(a / b) * b - a) << endl;
    }

    return 0;
}