#include <stdio.h>

int main(void) {
	int num, result, count = 0;
	int a, b, c, d;

	scanf("%d", &num);
	result = num;

	do {
		a = num / 10;
		b = num % 10;
		c = (a + b) / 10;
		d = (a + b) % 10;
		num = b * 10 + d;
		count++;
	} while (num != result);
	printf("%d", count);
	
}
