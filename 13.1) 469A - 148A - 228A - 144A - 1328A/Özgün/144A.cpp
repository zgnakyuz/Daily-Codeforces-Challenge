#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, k, max, max_i{}, min, min_i{};
    
    cin >> n;
    cin >> max;
    min = max;
    
    for (int i = 1; i < n; ++i) {
        cin >> k;
        
        if (k > max) {
            max = k;
            max_i = i;
        } else if (k <= min) {
            min = k;
            min_i = i;
        }
    }
    
    if (max_i > min_i) {
        cout << max_i + n - 2 - min_i;
    } else {
        cout << max_i + n - 1 - min_i;
    }

    return 0;
}