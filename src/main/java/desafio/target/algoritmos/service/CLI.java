package desafio.target.algoritmos.service;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import desafio.target.algoritmos.algoritmos.FibonacciAlgoritmoImpl;
import desafio.target.algoritmos.algoritmos.OcorrenciasLetraAAlgoritmoImpl;
import desafio.target.algoritmos.algoritmos.SomaAlgoritmo;

@Service
public class CLI {

    private Scanner scanner = new Scanner(System.in);
    private FibonacciAlgoritmoImpl fibonacci = new FibonacciAlgoritmoImpl();
    private OcorrenciasLetraAAlgoritmoImpl ocorrenciasLetraA = new OcorrenciasLetraAAlgoritmoImpl();
    private SomaAlgoritmo soma = new SomaAlgoritmo();

    public void showMenu() {
        System.out.println(this.createMessage());

        try {
            int input = scanner.nextInt();
            scanner.nextLine();
            this.menu(input);

        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("!! Entrada inválida !! ");
        }
    }

    private String createMessage() {
        String solicitarInput = "\n--- Insira o número correspondente ao recurso desejado ---";
        String listarRecursos =
        "\n1 - Desafio 1: Fibonacci" +
        "\n2 - Desafio 2: Ocorrências da letra A em uma String" +
        "\n3 - Desafio 3: Soma";
        return solicitarInput.concat(listarRecursos);
    }

    private void menu(int input) {
        switch (input) {
            case 1:
                fibonacci.algoritmo(scanner);
                break;
            case 2:
                ocorrenciasLetraA.algoritmo(scanner);
                break;
            case 3:
                soma.algoritmo();
                break;
            case 0:
                break;
        }
    }
}