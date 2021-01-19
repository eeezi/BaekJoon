#include <stdio.h>

int main(void) {
	int n, f, rmd, div;
	scanf("%d", &n);
	scanf("%d", &f);

	n -= (n % 100);
	rmd = n % f;
  
	if (rmd == 0)
		div = n;
	else
		div = n - rmd + f;
	
	printf("%02d", div % 100);
}
