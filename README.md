# Desafio Tecnico - Target Sistemas

## Como rodar
<details><summary>Expandir</summary>


### Pré-requisitos

- Java 17

### Rodando

Entre no diretório raiz do projeto e execute:

    ./mvnw spring-boot:run

Exemplo: 
    
    git clone https://github.com/mtpontes/desafio-target-sistemas.git
    
    desafio-target-ribeirao_preto

    ./mvnw spring-boot:run
</details>

## Desafio 1
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

[Resposta](https://github.com/mtpontes/desafio-target-ribeirao_preto/blob/main/src/main/java/desafio/target/algoritmos/algoritmos/FibonacciAlgoritmoImpl.java)

## Desafio 2
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

[Resposta](https://github.com/mtpontes/desafio-target-ribeirao_preto/blob/main/src/main/java/desafio/target/algoritmos/algoritmos/OcorrenciasLetraAAlgoritmoImpl.java)


## Desafio 3
Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

[Resposta](https://github.com/mtpontes/desafio-target-ribeirao_preto/blob/main/src/main/java/desafio/target/algoritmos/algoritmos/SomaAlgoritmo.java)

## Desafio 4
Descubra a lógica e complete o próximo elemento:

    a) 1, 3, 5, 7

    b) 2, 4, 8, 16, 32, 64

    c) 0, 1, 4, 9, 16, 25, 36

    d) 4, 16, 36, 64

    e) 1, 1, 2, 3, 5, 8

    f) 2,10, 12, 16, 17, 18, 19


Respostas:

a) O próximo número é o número atual + 2. Próximo elemento: 9.

b) O próximo número é o número atual x 2. Próximo elemento: 128.

c) Cada número é o quadrado de inteiros consecutivos, começando a partir de 0. O próximo inteiro seria 7, portanto, consideramos 7². Próximo elemento: 49.

d) Cada número é o quadrado de uma sequência de números pares consecutivos. O próximo par seria 10, portanto, consideramos 10². Próximo elemento: 100.

e) O próximo número é a soma do número atual + anterior. Próximo elemento: 13.

f) Nesta sequência há apenas números que começam com a letra D. Próximo elemento: 200.


## Desafio 5
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

Resposta:

Considerando os interruptores 1, 2 e 3 e as salas A, B e C, podemos começar ligando o interruptor 1 por alguns minutos, em seguida desliga-lo e ligar o interruptor 2. Agora podemos ir à sala A validar a qual interruptor ela percente, se a lâmpada estiver acesa, a sala A está para o interruptor 2, se estiver apagada mas com a lâmpada quente, está para o interruptor 1, se estiver apagada e fria, está para o interruptor 3.

Em seguida podemos ir para a sala B, onde aplicamos a mesma lógica usada na sala A, que nos permite descobrir com exatidão a relação de sala e interruptor , fazendo com que a relação do interruptor 3 seja feita com a sala que sobrar.