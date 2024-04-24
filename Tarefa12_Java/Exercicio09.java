package tarefa12;

import java.util.Scanner;

public class Exercicio09 {
	// 9) Verificar Triângulo: Implemente um método que receba três números inteiros
	// como argumentos e retorne verdadeiro se eles podem ser os comprimentos dos
	// lados de um triângulo, e falso caso contrário.

	public static boolean verificar(int lado1, int lado2, int lado3) {
		if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
			return false;
		}
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro lado do triangulo: ");
		int lado1 = sc.nextInt();

		System.out.println("Digite o segundo lado do triangulo: ");
		int lado2 = sc.nextInt();

		System.out.println("Digite o terceiro lado do triangulo: ");
		int lado3 = sc.nextInt();

		if (verificar(lado1, lado2, lado3)) {

			System.out.println("Os números podem ser os comprimentos dos lados de um triângulo.");
		} else {

			System.out.println("Os números não podem ser os comprimentos dos lados de um triângulo.");
		}
		sc.close();
	}

}
