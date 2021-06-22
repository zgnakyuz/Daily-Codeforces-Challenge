#include <iostream>

using namespace std;

int main() {
  int n, freePolice{0}, untreatedCount{0}, log;

  cin >> n;

  while (n > 0) {
	cin >> log;  
	
	if (log > 0) {
	  freePolice += log;
	} else {
	  if (freePolice > 0) {
		freePolice--;  // busy with crime
	  } else {
	    untreatedCount++;
	  }
	}
	
	n--;
  }	  

  cout << untreatedCount;
  
  return 0;
}