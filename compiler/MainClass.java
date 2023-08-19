import java.util.Scanner;
public class MainClass {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int a, b, c, d;
	double dec;
	String resposta;
	System.out.println("Programa Teste");
	System.out.println("Digite A");
	a = keyboard.nextInt();
	System.out.println("Digite B");
	b = keyboard.nextInt();
	if (a<b) {
		c = a+b;

	}
	else {
		c = a-b;

	}
	System.out.println("C e igual a ");
	System.out.println(c);
	d = c*a+b;
	resposta = "D e igual a ";
	System.out.println(resposta);
	System.out.println(d);
	for (int i = 0;i<10;i += 1) {
		System.out.println(i);

	}
	for (int j = 0;j<=10;j += 2) {
		System.out.println(j);

	}
	for (int k = 10;k<=0;k += -1) {
		System.out.println(k);

	}
	d = 0;
	while (d<10) {
		d = d+1;
		System.out.println(resposta);
		System.out.println(d);
	}
	while (d<=100) {
		d = d+1;
		System.out.println(resposta);
		System.out.println(d);
	}
	dec = 3.14;
	System.out.println(3.14);
	for (double z = 0;z<1;z += 0.1) {
		System.out.println(z);

	}
}
}

