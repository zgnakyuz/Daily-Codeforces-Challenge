#include <iostream>

using namespace std;

int main() {
  int n, diff{};
  char s;

  cin >> n;

  while (n--) {
    cin >> s;

    if (s == 'A') diff++;
    else          diff--;

    if (abs(diff) > n) {  // no need to look other chars
      break;
    }
  }

  if (diff > 0)       cout << "Anton";
  else if (diff < 0)  cout << "Danik";
  else                cout << "Friendship";

  return 0;
}
