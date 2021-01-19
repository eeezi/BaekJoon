#include <stdio.h>

int main(void) {
    int a, b;
    int num1, num2, num3;
    scanf("%d %d", &a, &b);

    num1 = b % 10;
    num2 = (b % 100) / 10;
    num3 = b / 100;

    printf("%d\n%d\n%d\n%d", a * num1, a * num2, a * num3, a * b);
}
