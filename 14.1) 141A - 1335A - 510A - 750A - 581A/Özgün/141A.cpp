#include <bits/stdc++.h>

using namespace std;

int main() {
  string str;
  unordered_map<char, int> charCounts;
  bool isFinished = false;

  cin >> str;

  for (char c : str) {  // guest
    charCounts[c]++;
  }

  cin >> str;

  for (char c : str) {  // host
    charCounts[c]++;
  }

  cin >> str;

  for (char c : str) {  // pile
    if (charCounts[c] == 0) {
      cout << "NO";
      isFinished = true;
      break;
    }

    if (charCounts[c] == 1) {
      charCounts.erase(c);
    } else {
      charCounts[c]--;
    }
  }

  if (!isFinished) {
    if (charCounts.empty()) cout << "YES";
    else                    cout << "NO";
  }

  return 0;
}