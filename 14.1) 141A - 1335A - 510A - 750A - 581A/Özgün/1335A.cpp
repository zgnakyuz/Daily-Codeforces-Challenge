#include <bits/stdc++.h>

using namespace std;

int main() {
  int t, n;
  unordered_map<char, int> charCounts;

  cin >> t;

  while (t--) {
    cin >> n;
    long long count = n / 2;

    if (n % 2 == 0) {
      count -= 1;
    }

    cout << count << endl;
  }
  
  return 0;
}