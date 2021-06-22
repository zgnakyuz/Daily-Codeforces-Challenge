#include <bits/stdc++.h>

using namespace std;

int main() {
  int t;
  string b;

  cin >> t;

  while (t--) {
    cin >> b;

    for (int i = 0; i < b.length(); i += 2) {
      cout << b[i];
    }

    cout << b[b.length() - 1] << endl;
  }

  return 0;
}
