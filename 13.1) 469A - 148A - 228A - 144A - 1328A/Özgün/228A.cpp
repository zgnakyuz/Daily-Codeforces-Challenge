#include <bits/stdc++.h>

using namespace std;

int main() {
    int d, count{};
    unordered_map<int, int> nums;
    
    for (int i = 0; i < 4; ++i) {
        cin >> d;
        nums[d]++;
    }
    
    for (auto pair : nums) {
        count += pair.second - 1;
    }

    cout << count;

    return 0;
}