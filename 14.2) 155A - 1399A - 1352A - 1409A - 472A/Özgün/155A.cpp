#include <bits/stdc++.h>

using namespace std;

int main() {
  int n, num, min, max, count{};

  cin >> n >> min;

  max = min;
  n--;

  while (n--) {
    cin >> num;

    if (num > max) {
      max = num;
      count++;
    } else if (num < min) {
      min = num;
      count++;
    }
  }

  cout << count;

  return 0;
}