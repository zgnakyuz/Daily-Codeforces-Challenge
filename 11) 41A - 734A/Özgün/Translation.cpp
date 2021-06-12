#include <iostream>

using namespace std;

int main() {
  string s, t;
  cin >> s >> t;

  int wordLen = s.length();

  bool isEqual = true;
  int j = wordLen - 1;
  for (int i = 0; i < wordLen; ++i) {
    if (s[i] != t[j]) {
      cout << "NO";
      isEqual = false;
      break;
    }

    j--;
  }

  if (isEqual) cout << "YES";

  return 0;
}
