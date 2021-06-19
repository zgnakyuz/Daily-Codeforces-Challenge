#include <bits/stdc++.h>

using namespace std;

int main() {
	string letters;
    unordered_map<char, int> nums;

    getline(cin, letters);

    for (int i = 1; i < letters.length() - 1; i += 3) {
        nums[letters.at(i)];
    }

    cout << nums.size();

    return 0;
}