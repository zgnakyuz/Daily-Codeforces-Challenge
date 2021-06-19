#include <bits/stdc++.h>

using namespace std;

int main() {
  int n;
  string str;
  unordered_map<char, int> chars;

  cin >> n;
  cin >> str;

  if (n < 26) {
    cout << "NO";
  } else {
    for (int i = 0; i < n; ++i) {
      chars[tolower(str[i])];
    }

    if (chars.size() == 26) cout << "YES";
    else                    cout << "NO";
  }

  return 0;
}