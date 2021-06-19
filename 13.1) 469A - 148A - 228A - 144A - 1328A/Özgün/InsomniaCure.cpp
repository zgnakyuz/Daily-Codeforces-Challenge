#include <bits/stdc++.h>

using namespace std;

int main() {
    int d, count{};
    bool isFinished = false;
    unordered_map<int, int> nums;

    for (int i = 0; i < 4; ++i) {
        cin >> d;
        nums[d];

        if (d == 1) {
            for (int j = i; j < 4; ++j) cin >> d;

            cout << d;
            isFinished = true;
            break;
        }
    }

    if (!isFinished) {
        cin >> d;

        for (int i = 2; i <= d; ++i) {
            for (auto num : nums) {
                if (i % num.first == 0) {
                    count++;
                    break;
                }
            }
        }

        cout << count;
    }

    return 0;
}