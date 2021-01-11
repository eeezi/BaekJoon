//1번째 시도
#include <stdio.h>

int main(void) {
	int arr[1000] = { 0 };
	int max = 0, min = 0, n;
	scanf("%d", &n);

	for (int i = 0; i < n; i++)
		scanf("%d", &arr[i]);
    
	for (int i = 1; i <= n; i++) {
		if (arr[i - 1] < arr[i]) max = arr[i];
		if (arr[i - 1] > arr[i]) min = arr[i - 1];
	}

	printf("%d %d", min, max);
}
//런타임 에러




//2번째 시도
#include <stdio.h>
#include <stdlib.h>

int main() {
	int max = 0, min = 0, n;
	scanf("%d", &n);
	int* arr = (int *)malloc(sizeof(int) * n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
		if (arr[i] < max) max = arr[i];
		if (arr[i] > min) min = arr[i];
	}
	
	printf("%d %d", min, max);

	return 0;
}
//런타임 에러
