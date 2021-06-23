#include <bits/stdc++.h>

using namespace std;

int main() {
  int n, a, max, ttl{};

  cin >> n >> max;
  n--;

  for (int i = 1; i < n + 1; ++i) {
    cin >> a;

    if (a > max) {
      ttl += (a - max) * i;  // adding all of the previous numbers' diff
      max = a;
    } else if (a < max) {
      ttl += max - a;
    }
  }

  cout << ttl;

  return 0;
}
