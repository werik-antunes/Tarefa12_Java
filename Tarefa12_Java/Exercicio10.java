package tarefa12;

public class Exercicio10 {
	// 10) Calcular Média Ponderada: Escreva uma função que calcule a média
	// ponderada de três valores, onde os pesos são passados como argumentos.

	public static double calcular(double valor1, double valor2, double valor3, int peso1, int peso2,
			int peso3) {
		
		double somaPesos = peso1 + peso2 + peso3;
		double somaProdutos = (valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3);
		double media = somaProdutos / somaPesos;
		return media;
	}

	public static void main(String[] args) {

		double valor1 = 3.3; 
		double valor2 = 6.6;
		double valor3 = 9.9; 
		int peso1 = 3; 
		int peso2 = 6; 
		int peso3 = 9; 
		double media = calcular(valor1, valor2, valor3, peso1, peso2, peso3);
		System.out.println("A média ponderada é: " + media);
	}

}
