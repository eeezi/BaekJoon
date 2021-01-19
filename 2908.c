#include <stdio.h>

int reverse(int x) {
	return (x % 10) * 100 + (x % 100 / 10) * 10 + (x / 100);
}

int main(void) {
	int a, b;

	scanf("%d %d", &a, &b);
	a = reverse(a);
	b = reverse(b);

	if (a < b) printf("%d", b);
	else printf("%d", a);

}
