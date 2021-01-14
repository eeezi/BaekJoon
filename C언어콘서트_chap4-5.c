#include <stdio.h>
#include <math.h>

int main(void) {
	double x, result;

	printf("수식: f(x) = (x ^ 3 - 20) / (x - 7)");
	printf("정수를 입력하시오");
	scanf("%d", &x);
	result = (pow(x, 3) - 20) / (x - 7);
	printf("수식의 값은 %lf입니다.", result);

}
