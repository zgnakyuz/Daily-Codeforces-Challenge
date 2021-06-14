#include <iostream>

using namespace std;

int main() {
  int n, count{1};
  char prev_c, c;

  cin >> n;

  cin >> prev_c >> prev_c;
  n--;

  while (n--) {
    cin >> c;

    if (c == prev_c)  count++;

    cin >> prev_c;
  }

  cout << count;

  return 0;
}
