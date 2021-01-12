#include <stdio.h>

int main(void){
	int a, b, c;
	int mul, num;
	int arr[10] = { 0 };

	scanf("%d %d %d", &a, &b, &c);
	mul = a * b * c;
	
	for(int i = 0; mul > 0; i++){
	  num = mul % 10;
	  arr[num] += 1;
	  mul /= 10;
	}
	
	for(int i = 0; i < 10; i++) printf("%d\n", arr[i]);	
}
