#include <iostream>

using namespace std;

int main() {
  int n, p;
  double total{};

  cin >> n;

  for (int i = 0; i < n; ++i) {
    cin >> p;
    total += p;
  }

  cout << total / n;

  return 0;
}
