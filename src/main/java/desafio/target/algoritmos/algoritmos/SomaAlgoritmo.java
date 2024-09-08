package desafio.target.algoritmos.algoritmos;

public class SomaAlgoritmo {

	public void algoritmo() {
		int INDICE = 13;
		int SOMA = 0;
		int K = 0;

		while (K < INDICE) {
			K = K + 1;
			SOMA = SOMA + K;
		}

		System.out.println("\nResultado da soma proposta no desafio 3: " + SOMA + "\n");
	}
}