#include <bits/stdc++.h>

using namespace std;

int main() {
  int max, min, temp;

  cin >> max;
  min = max;

  for (int i = 0; i < 2; ++i) {
    cin >> temp;

    if (temp < min) {
      min = temp;
    } else if (temp > max) {
      max = temp;
    }
  }

  cout << max - min;

  return 0;
}
