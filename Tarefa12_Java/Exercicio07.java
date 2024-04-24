package tarefa12;

import java.util.Scanner;

public class Exercicio07 {

	public static boolean bissexto(int ano) {
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
//7) Verificar Ano Bissexto: Desenvolva um método que determine se um ano é bissexto ou não.
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();
		if (bissexto(ano)) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}
		sc.close();
	}

}
