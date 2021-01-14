#include <stdio.h>
#include <math.h>

double cal(double x);

int main(void) {
	double x, result;

	printf("정수를 입력하시오 ");
	scanf("%lf", &x);
	result = cal(x);
	printf("수식의 값은 %lf입니다.", result);

}

double cal(double x) {
	return (pow(x, 3) - 20) / (x - 7);
}
