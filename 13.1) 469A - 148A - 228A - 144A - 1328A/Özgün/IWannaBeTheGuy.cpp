#include <iostream>
#include <unordered_map>

using namespace std;

int main() {
  int n, p, num;
  unordered_map<int, int> levels;

  cin >> n >> p;

  while (p--) {
    cin >> num;
    levels[num];  // initializing the value of 'num' key
  }

  cin >> p;

  while (p--) {
    cin >> num;
    levels[num];
  }

  if (levels.size() == n) cout << "I become the guy.";
  else                    cout << "Oh, my keyboard!";

  return 0;
}
