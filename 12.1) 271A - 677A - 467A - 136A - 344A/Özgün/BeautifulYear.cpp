#include <iostream>

using namespace std;

int main() {
  int y;

  cin >> y;

  y++;

  while (true) {
    int a = y / 1000;
    int b = y / 100 % 10;
    int c = y / 10 % 10;
    int d = y % 10;

    if (a == b) {
      y = a * 1000 + (b + 1) * 100;
    } else if (b == c) {
      y = a * 1000 + b * 100 + (c + 1) * 10;
    } else {
      if (a != c && a != d && b != d && c != d) {
        cout << y;
        break;
      }

      y++;
    }
  }

  return 0;
}
