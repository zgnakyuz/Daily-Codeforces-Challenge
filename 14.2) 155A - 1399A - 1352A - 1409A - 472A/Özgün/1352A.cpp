#include <bits/stdc++.h>

using namespace std;

int main() {
  int t, num;
  string n;

  cin >> t;

  while (t--) {
    cin >> n;
    int count{};
    vector<int> digits;

    for (int i = 0; i < n.length(); ++i) {
      num = n[i] - 48;

      if (num != 0) {
        digits.push_back(num * round(pow(10, n.length() - i - 1)));
        count++;
      }
    }

    cout << count << endl;

    for (int i = 0; i < digits.size(); ++i) {
      cout << digits[i];

      if (i != digits.size() - 1) {
        cout << " ";
      }
    }

    cout << endl;
  }

  return 0;
}
