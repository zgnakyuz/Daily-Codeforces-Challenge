#include <bits/stdc++.h>

using namespace std;

int main() {
  int n, count{};
  vector<int> bills{100, 20, 10, 5, 1};

  cin >> n;

  for (int bill : bills) {
    int subCount = n / bill;
    
    if (subCount != 0) {
      count += subCount;
      n %= bill;
    }
  }

  cout << count;

  return 0;
}