import java.util.Scanner;

/*Desenvolva um programa para informar se um um número n é primo ou não, 
 * sendo n um valor que o usuário irá inserir pelo console. 
 * Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.
*/

public class Exercicio3 {

	public static void main(String[] args) {
		
		int n,p;
		boolean primo = true;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println ("Digite um numero: ");
		n = leia.nextInt();
		
		if(n % 2 == 0)
		{
			System.out.println("Esse numero nao é primo");
			
		}
		
		else if (n % 2 == 1)
		{
			System.out.println("Esse numero é primo");
		}

	}

}
