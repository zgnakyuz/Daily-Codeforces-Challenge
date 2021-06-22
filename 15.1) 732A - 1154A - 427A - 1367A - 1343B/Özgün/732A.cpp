#include <bits/stdc++.h>

using namespace std;

int main() {
  int k, r;

  cin >> k >> r;

  for (int i = 1; i < 11; ++i) {
    int mod = k * i % 10;

    if (mod == 0 || mod == r) {
      cout << i;
      break;
    }
  }

  return 0;
}
