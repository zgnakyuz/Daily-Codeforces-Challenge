#include <iostream>

using namespace std;

int main() {
  int n, p, q, free{};

  cin >> n;

  while (n--) {
    cin >> p >> q;

    if (q - p >= 2)  free++;
  }

  cout << free;
  return 0;
}
