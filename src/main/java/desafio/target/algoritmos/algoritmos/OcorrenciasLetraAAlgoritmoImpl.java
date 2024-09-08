package desafio.target.algoritmos.algoritmos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OcorrenciasLetraAAlgoritmoImpl implements Algoritmo {

	private final Pattern regex = Pattern.compile("[aA]");
	private final String sair = "sair";

	@Override
	public void algoritmo(Scanner scanner) {
		String message = this.createMessage();
		String input = "";
		while (true) {
			System.out.println(message);
			input = scanner.nextLine();
			if (input.equalsIgnoreCase(this.sair)) break;

			Matcher matcher = this.regex.matcher(input);
			int ocorrencias = 0;
			while (matcher.find()) ocorrencias++;

			if (ocorrencias > 0) 
				System.out.println("\nEsta String possui a letra A" + "\nTotal de ocorrências: " + ocorrencias);
			else System.out.println("\nEsta String não possui a letra A");
		}
	}

	private String createMessage() {
		String validadorDeFibonacci = "\n-- Verificador de ocorrências da letra A --";
		String insiraUmNumero = "\n* Insira qualquer texto";
		String sair = "\n* Para sair, insira 'sair'\n";
		return validadorDeFibonacci.concat(insiraUmNumero).concat(sair);
	}
}