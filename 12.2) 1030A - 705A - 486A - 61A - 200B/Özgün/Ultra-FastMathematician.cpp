#include <iostream>

using namespace std;

int main() {
  string n1, n2;

  cin >> n1 >> n2;

  for (int i = 0; i < n1.length(); ++i) {
    if ((n1[i] + n2[i]) % 2 == 0) cout << 0;
    else                          cout << 1;
  }

  return 0;
}
