#include <stdio.h>

int main(void) {
	int n;
	scanf("%d", &n);
	
	for (int j = 0; j < n; j++) {
		for (int i = n; i > j; i--) {
			printf("*");
		}
		printf("\n");
	}
}
