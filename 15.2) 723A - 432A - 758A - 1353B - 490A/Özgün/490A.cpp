#include <bits/stdc++.h>

using namespace std;
typedef unsigned int uint;

int main() {
  int n, t;
  uint minCount{4999};
  unordered_map<int, vector<int>> childs;

  cin >> n;

  for (int i = 1; i < n + 1; ++i) {
    cin >> t;

    childs[t].push_back(i);
  }

  uint mapSize = childs.size();
  if (mapSize < 3) {
    cout << 0;
  } else {
    for (const auto& pair : childs) {
      uint local = pair.second.size();
      if (local < minCount) {
        minCount = local;
      }
    }

    cout << minCount << endl;

    for (int i = 0; i < minCount; ++i) {
      for (int j = 1; j < 4; ++j) {
        cout << childs[j][i] << " ";
      }

      cout << endl;
    }
  }

  return 0;
}
