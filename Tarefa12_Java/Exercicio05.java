package tarefa12MetodosEmJava;

public class Exercicio05 {

	public static String inverter(String str) {
		char[] caracteres = str.toCharArray();
		int inicio = 0;
		int fim = str.length() - 1;

		while (inicio < fim) {
			char temp = caracteres[inicio];
			caracteres[inicio] = caracteres[fim];
			caracteres[fim] = temp;

			inicio++;
			fim--;
		}

		return new String(caracteres);
	}

	public static void main(String[] args) {
//5) Inverter String: Implemente um método que inverta uma string passada como argumento.

		System.out.println("Digite uma frase: ");
		String str = "Na minha cidade no interior";
		String strInvertida = inverter(str);
		System.out.println("String invertida: " + strInvertida);

	}

}
