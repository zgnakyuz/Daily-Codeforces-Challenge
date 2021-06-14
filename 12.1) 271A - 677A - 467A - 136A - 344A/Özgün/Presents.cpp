#include <iostream>

using namespace std;

int main() {
  int n, p;

  cin >> n;

  int corr[++n];

  for (int i = 1; i < n; ++i) {
    cin >> p;

    corr[p] = i;
  }

  for (int i = 1; i < n; ++i) {
    cout << corr[i] << " ";
  }

  return 0;
}
