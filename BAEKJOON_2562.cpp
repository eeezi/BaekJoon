#include <stdio.h>

int main(void){
	int num[9] = {0};
	
	for (int i=0; i<9; i++) scanf("%d", &num[i]);
	
	int max = num[0], index = 0;

	for (int i=0; i<9; i++){
		if (max <= num[i]){
			max = num[i];
			index = i;
		}
	}

	printf("%d\n%d", max, index + 1);
  
}
