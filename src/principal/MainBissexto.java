package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import operadores.AnoBissexto;

public class MainBissexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		boolean continuar = true;
		while (continuar) {
			int ano = 0;
			System.out.println("Digite o ano com quatro d�gitos:");

			try {
				ano = sc.nextInt();
				AnoBissexto.isBissexto(ano);
				continuar = false;
			} catch (InputMismatchException e) {
				System.out.println("Digite somente n�meros Inteiros!\nEx:. 2015");
				String lixo = sc.nextLine();
			}
		}
		// AnoBissexto anoBissexto = new AnoBissexto();
		// instanciar;
		// static n�o precisa instanciar;

	}

}
