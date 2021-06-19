#include <bits/stdc++.h>

using namespace std;

int main() {
  int n, count{};
  string hedron;
  unordered_map<char, int> hedronFaces {{'T', 4}, {'C', 6},
                                        {'O', 8}, {'D', 12},
                                        {'I', 20}};

  cin >> n;

  while (n--) {
    cin >> hedron;
    count += hedronFaces[hedron.at(0)];
  }

  cout << count;

  return 0;
}