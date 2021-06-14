#include <iostream>

using namespace std;

int main() {
  int n, d;
  bool isEasy = true;

  cin >> n;

  while (n--) {
    cin >> d;

    if (d == 1) {
      cout << "HARD";
      isEasy = false;
      break;
    }
  }

  if (isEasy) cout << "EASY";

  return 0;
}
