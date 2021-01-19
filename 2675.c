#include <stdio.h>
#include <string.h>

void print(char a[], int b) {
	for(int i = 0; i < strlen(a); i++)
		for(int j = 0; j < b; j++)
			printf("%c", a[i]);
	printf("\n");
}

int main(void) {
	int t, r;
	char s[21];
	scanf("%d", &t);

	for(int i = 0; i < t; i++) {
		scanf("%d", &r);
		scanf("%s", s);
		print(s, r);
	}
}
