import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int num1, num2;

		try {

			System.out.print("Digite o primeiro número : ");
			num1 = ler.nextInt();

			System.out.print("Digite o segundo número : ");
			num2 = ler.nextInt();

			if (num1 >= num2) {
				throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
			}

			for (int i = num1; i <= num2; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}

		catch (Exception e) {
			System.out.println("Informa números inteiros válidos como parâmetros.");
		}

		ler.close();

	}
}

class ParametrosInvalidosException extends Exception {

	public ParametrosInvalidosException(String message) {
		super(message);
	}

}
