#include <bits/stdc++.h>

using namespace std;

int main() {
  int n, h, a, count{};
  unordered_map<int, int> hosts;
  unordered_map<int, int> guests;

  cin >> n;

  while (n--) {
    cin >> h >> a;
    hosts[h]++;
    guests[a]++;
  }

  for (auto pair : guests) {
    count += pair.second * hosts[pair.first];
  }

  cout << count;

  return 0;
}