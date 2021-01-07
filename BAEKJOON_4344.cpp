#include <stdio.h>

int main(void) {
	int c = 0, n = 0;
	scanf("%d", &c);

	for (int i = 0; i < c; i++) {
		int score[1000], sum = 0, count = 0;
		double avg = 0.0;
		scanf("%d", &n);

		for (int j = 0; j < n; j++) {
			scanf("%d", &score[j]);
			sum += score[j];
		}

		avg = (double)sum / n;

		for (int k = 0; k < n; k++) {
			if (avg < score[k]) count++;
		}
		
		printf("%.3lf%%\n", (double)count * 100 / n);
	}
}
