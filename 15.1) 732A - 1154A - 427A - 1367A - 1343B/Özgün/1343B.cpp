#include <bits/stdc++.h>

using namespace std;

int main() {
  int t, n, half;

  cin >> t;

  while (t--) {
    cin >> n;
    
    half = n / 2;
    
    if (half % 2 == 0) {
      cout << "YES\n";

      for (int i = 1; i < half + 1; ++i) {
        cout << i * 2;

        if (i != n) {
          cout << " ";
        }
      }

      for (int i = 1; i < half; ++i) {
        cout << i * 2 - 1 << " ";
      }

      cout << half + n - 1 << endl;
    } else {
      cout << "NO\n";
    }
  }

  return 0;
}
