#include <stdio.h>
int main(){
	int a, b, c, d;
	float dec;
	char* resposta;
	printf("Programa Teste");
	printf("Digite A");
	scanf("%d", &a);
	printf("Digite B");
	scanf("%d", &b);
	if ((a<b) && (b>a)) {
		c = a+b;

	}
	else {
		c = a-b;

	}
	printf("C e igual a ");
	printf("%d\n", c);
	d = c*a+b;
	printf("%s\n", resposta);
	printf("%d\n", d);
	for (int i = 0;i<10;i += 1) {
		printf("%d\n", i);

	}
	for (int j = 0;j<=10;j += 2) {
		printf("%d\n", j);

	}
	for (int k = 10;k<=0;k += -1) {
		printf("%d\n", k);

	}
	d = 0;
	while ((d<10) || (d>=1)) {
		d = d+1;
		printf("%s\n", resposta);
		printf("%d\n", d);
	}
	while ((d<=100)) {
		d = d+1;
		printf("%s\n", resposta);
		printf("%d\n", d);
	}
	dec = 3.14;
	printf("%f\n", 3.14);
	for (float z = 0;z<1;z += 0.1) {
		printf("%f\n", z);

	}
return 0;
}

