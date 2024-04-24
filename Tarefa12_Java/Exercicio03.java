package tarefa12MetodosEmJava;

import java.util.Scanner;

public class Exercicio03 {

	public static boolean palindromo(String str) {

		str = str.replaceAll("\\s+", "").toLowerCase();

		int inicio = 0;
		int fim = str.length() - 1;

		while (inicio < fim) {

			if (str.charAt(inicio) != str.charAt(fim)) {
				return false;
			}

			inicio++;
			fim--;
		}

		return true;
	}

	public static void main(String[] args) {
		// 3) Verificar Palíndromo: Desenvolva um método que receba uma string como
		// entrada e retorne verdadeiro se ela for um palíndromo (ou seja, se ela pode
		// ser lida da mesma forma de trás para frente), e falso caso contrário.

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frases: ");
		String str1 = sc.next();
		String str2 = sc.next();

		System.out.println("É palíndromo? " + str1 + ": " + palindromo(str1));
		System.out.println("É palíndromo? " + str2 + ": " + palindromo(str2));
		sc.close();
	}

}
