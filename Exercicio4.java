import java.util.Scanner;

/*Desenvolva um programa para mostrar no console os primeiros n números primos entre 1 e m, 
 * sendo m um valor que o usuário irá inserir pelo console.
*/

public class Exercicio4 {

	public static void main(String[] args) {

		int m, n = 2;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o numero, a quantidade de numeros primos que vc quer que apareca: ");

		m = leia.nextInt();

		System.out.println("\t\t**********Esses sao os numeros primos*************\n");

		for (n = 2; n < m; n++) {

			if (ehPrimo(n)) {

				System.out.print(n + " - ");
			}
		}
	}

	private static boolean ehPrimo(int num) {

		int x;

		if (num < 0) {
			num *= -1;
		}
		if ((num % 2 == 0) && (num > 2) || (num < 2)) {
			return false;
		}
		for (x = 3; x <= (int) Math.sqrt(num); x += 2) {

			if (num % x == 0) {
				return false;
			}
		}
		return true;
	}
}