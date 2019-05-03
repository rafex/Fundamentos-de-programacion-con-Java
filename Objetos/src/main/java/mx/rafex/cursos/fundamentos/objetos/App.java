package mx.rafex.cursos.fundamentos.objetos;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// Escribir un while que imprima del 50 al 80
		int num = 50;
		System.out.println("Los numeros son ");
		while (num < 80) {
			num = num + 1;
			System.out.println(num);
		}
		for (Integer i = 300; i <= 400; i++) {
			System.out.println(i);
		}
		int a = 1;
		while (a <= 80) {
			System.out.println(a);
			a++;
		}
	}
}
