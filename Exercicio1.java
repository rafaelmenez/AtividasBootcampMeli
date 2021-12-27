import java.util.Scanner;

/*Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor que o usuário irá inserir pelo console. 
Lembre-se que um número é par quando divisível por 2.
*/
public class Exercicio1 {

	public static void main(String[] args) {

		int n = 0, p = 1;
	

		Scanner leia = new Scanner (System.in);

		System.out.println("Digite a quantidade de números pares que sera exibido: ");
		n = leia.nextInt();


		for (p = 1; p <=n ; p++)
		{
			
			System.out.print ("Os números pares sao: " + p * 2);
		}
		

	}

}


