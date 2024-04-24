package tarefa12;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
//8) Calcular Potência: Crie uma função que calcule a potência de um número inteiro base elevado a um expoente inteiro positivo.
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número da base: ");
		int base = sc.nextInt();
		System.out.println("Digite o número do expoente: ");
		int expoente = sc.nextInt();
		int resultado = calcular(base, expoente);
		System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
		sc.close();
	}
	

	public static int calcular(int base, int expoente) {
		if (expoente == 0) {
			return 1;
		} else {
			int resultado = 1;
			for (int i = 1; i <= expoente; i++) {
				resultado *= base;
			}
			return resultado;
		}
	}

}
