#include <bits/stdc++.h>

using namespace std;

// O(1) solution
int main() {
  int n, k;

  cin >> n >> k;

  k = 240 - k;

  int result = floor((-5 + sqrt(25 + 40 * k)) / 10);

  if (result > n) cout << n;
  else            cout << result;

  return 0;
}