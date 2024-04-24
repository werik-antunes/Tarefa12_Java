package tarefa12MetodosEmJava;

import java.util.List;

public class Exercicio04 {

	public static double media(List<Integer> numeros) {
		// 4) Calcular Média: Crie uma função que calcule a média de uma lista de
		// números passada como parâmetro.

		if (numeros.isEmpty()) {
			return 0.0;
		}

		double soma = 0;

		for (int numero : numeros) {
			soma += numero;
		}

		return soma / numeros.size();
	}

	public static void main(String[] args) {

		List<Integer> numeros = List.of(10, 20, 30, 40, 50);
		double media = media(numeros);
		System.out.println("A média dos números é: " + media);

	}

}
