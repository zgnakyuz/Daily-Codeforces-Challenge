#include <iostream>

using namespace std;

int main() {
  int n, h, p_height, w{};

  cin >> n >> h;

  while (n--) {
    cin >> p_height;
    if (p_height > h) w += 2;
    else              w++;
  }

  cout << w;

  return 0;
}
