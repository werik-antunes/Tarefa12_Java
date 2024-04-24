package tarefa12MetodosEmJava;

import java.util.Scanner;

public class Exercicio02 {

	public static int calcular(int numero) {

		if (numero == 0 || numero == 1) {
			return 1;
		}

		int resultado = 1;

		for (int i = 2; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public static void main(String[] args) {
		// 2) Calcular Fatorial: Escreva um método para calcular o fatorial de um número
		// inteiro positivo passado como parâmetro.
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		int fatorial = calcular(numero);
		System.out.println("O fatorial de " + numero + " é: " + fatorial);
		sc.close();
	}

}
