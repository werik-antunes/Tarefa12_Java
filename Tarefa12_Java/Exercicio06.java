package tarefa12MetodosEmJava;

public class Exercicio06 {

	public static int contarVogais(String str) {
		str = str.toLowerCase();
		int contador = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		// 6) Contar Vogais: Escreva uma função que conte o número de vogais em uma
		String str = " The King of Dogtown";
		int numVogais = contarVogais(str);
		System.out.println("O número de vogais na string é: " + numVogais);
	}

}
