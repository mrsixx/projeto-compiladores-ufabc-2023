import java.util.Scanner;
public class MainClass {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	String name;
	int faltas;
	double n1, n2, n3, n4, media;
	System.out.println("INSIRA OS DADOS DOS ALUNOS \n\n");
	System.out.println("nome do aluno: ");
	name = keyboard.nextLine();
	System.out.println("digite a N1: ");
	n1 = keyboard.nextDouble();
	System.out.println("digite a N2: ");
	n2 = keyboard.nextDouble();
	System.out.println("digite a N3: ");
	n3 = keyboard.nextDouble();
	System.out.println("digite a N4: ");
	n4 = keyboard.nextDouble();
	System.out.println("quantas faltas o aluno tem? ");
	faltas = keyboard.nextInt();
	media = ((((n1)+(n2))+(n3))+(n4))/(4);
	System.out.println("MEDIA: ");
	System.out.println(media);
	System.out.println("FALTAS: ");
	System.out.println(faltas);
}
}

