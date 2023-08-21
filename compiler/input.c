#include <stdio.h>
int main(){
	char* name;
	int faltas;
	float n1, n2, n3, n4, media;
	printf("INSIRA OS DADOS DOS ALUNOS \n\n");
	printf("nome do aluno: ");
	scanf("%s", &name);
	printf("digite a N1: ");
	scanf("%f", &n1);
	printf("digite a N2: ");
	scanf("%f", &n2);
	printf("digite a N3: ");
	scanf("%f", &n3);
	printf("digite a N4: ");
	scanf("%f", &n4);
	printf("quantas faltas o aluno tem? ");
	scanf("%d", &faltas);
	media = ((((n1)+(n2))+(n3))+(n4))/(4);
	printf("MEDIA: ");
	printf("%f\n", media);
	printf("FALTAS: ");
	printf("%d\n", faltas);
return 0;
}

