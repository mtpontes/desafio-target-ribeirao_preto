package desafio.target.algoritmos.algoritmos;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class FibonacciAlgoritmoImpl implements Algoritmo {

	@Override
	public void algoritmo(Scanner scanner) {
		int input = 0;
		String message = this.createMessage();
		while (true) {
			System.out.println(message);
			try {
				input = scanner.nextInt();
				scanner.nextLine();
				
			} catch (NoSuchElementException | IllegalStateException e) {
				break;
			}

			int currentValue = 0;
			int anterior = 0;
			int anteriorAoAnterior = 1;
			while(currentValue < input) {
				currentValue = anterior + anteriorAoAnterior;

				anteriorAoAnterior = anterior;
				anterior = currentValue;
			}

			int result = currentValue;
			if (result != input) System.out.println("\n ** Não pertence a sequência de Fibonacci: " + input + " **");
			else System.out.println("\n ** Pertence a sequência de Fibonacci: " + input + " **");
		}
	}

	private String createMessage() {
		String validadorDeFibonacci = "\n-- Validador de Fibonacci --";
		String insiraUmNumero = "\n* Insira um valor numérico";
		String sair = "\n* Para sair, insira qualquer valor não numérico";
		return validadorDeFibonacci.concat(insiraUmNumero).concat(sair);
	}
}