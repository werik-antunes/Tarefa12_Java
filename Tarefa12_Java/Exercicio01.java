package tarefa12MetodosEmJava;

import java.util.Scanner;

public class Exercicio01 {

	public static boolean primo(int numero) {

		if (numero <= 1) {
			return false;
		}

		for (int i = 2; i <= numero / 2; i++) {

			if (numero % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		/*
		 * 1) Verificar Número Primo: Crie um método que receba um número inteiro como
		 * argumento e retorne verdadeiro se o número for primo, e falso caso contrário.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		if (primo(numero)) {
			System.out.println(numero + " é primo.");
		} else {
			System.out.println(numero + " não é primo.");
		}
		sc.close();
	}

}
