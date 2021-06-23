#include <bits/stdc++.h>

using namespace std;

int main() {
  int n, k, temp, cnt{};

  cin >> n >> k;

  while (n--) {
    cin >> temp;

    if (temp < 6 - k) {
      cnt++;
    }
  }

  cout << cnt / 3;

  return 0;
}
