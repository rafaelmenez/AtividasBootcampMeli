import java.util.Scanner;

//Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e m valores que o usuário irá inserir via console. 
 //Lembre-se que um número a é divisível por b quando o resto da divisão de a por b é igual a 0.


public class Exercicio2 {

	public static void main(String[] args) {
	
		int n,m,mt;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.print("Insira o primeiro valor: ");
		n = leia.nextInt();
		System.out.print("Insira a quantidade de multiplos que irá exibir: ");
		m = leia.nextInt();
		
		System.out.println("Os múltiplos do primeiro valor digitado sao: "+m);
		
		for(mt = 1; mt<=m; mt++)
		{
			System.out.println(m * mt);
		}
	}

}

