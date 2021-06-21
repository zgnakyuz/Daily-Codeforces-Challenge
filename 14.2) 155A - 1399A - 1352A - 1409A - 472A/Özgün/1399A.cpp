#include <bits/stdc++.h>

using namespace std;

int main() {
  int t, n, a;

  cin >> t;

  while (t--) {
    cin >> n;
    map<int, int> nums;

    while (n--) {
      cin >> a;

      nums[a];
    }

    int prev{};
    for (auto pair : nums) {  // getting first element
      prev = pair.first;
      break;
    }

    for (auto pair : nums) {
      int diff = pair.first - prev;

      if (diff == 1) {
        nums.erase(prev);
        prev = pair.first;
      } else if (diff > 1) {
        break;
      }
    }

    if (nums.size() == 1) {
      cout << "YES" << endl;
    } else {
      cout << "NO" << endl;
    }
  }

  return 0;
}
