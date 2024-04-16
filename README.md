# desafio-target-sistemas

1. Observe o trecho de código abaixo:

    ```bash
    int INDICE = 13, SOMA = 0, K = 0;

    enquanto K < INDICE faça

    {

    K = K + 1;

    SOMA = SOMA + K;

    }

    imprimir(SOMA);
    ```

    Ao final do processamento, qual será o valor da variável SOMA?
    <p><strong><code>SOMA = 91</code></strong>;</p>
    
    [Resposta 1](https://github.com/Nizoszz/desafio_target_sistemas/blob/master/sum_index/src/main/java/com/targetsistemas/sum_index/SumIndexApplication.java)
   

3. Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

    <p>IMPORTANTE:</p>
    <p>Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;</p>

    [Resposta 2](https://github.com/Nizoszz/desafio_target_sistemas/blob/master/fibonacci/src/main/java/com/targetsistemas/fibonacci/FibonacciApplication.java)
   

3) Descubra a lógica e complete o próximo elemento:

    <p>a) 1, 3, 5, 7,<strong><code>9</code></strong> resolução: Cada número é igual ao anterior + 2, formando os numeros ímpares</p>

    <p>b) 2, 4, 8, 16, 32, 64, <strong><code>128</code> resolução: Cada número é igual ao anterior multiplicado por 2</strong></p>

    <p>c) 0, 1, 4, 9, 16, 25, 36, <strong><code>49</code></strong> resolução: Cada número é igual ao anterior somado a um numero ímpar seguindo a sequencia 1,3,5,7,9,11 e 13 </p>

    <p>d) 4, 16, 36, 64, <strong><code>100</code></strong> resolução: Cada número é igual ao quadrado dos numeros pares</p>

    <p>e) 1, 1, 2, 3, 5, 8, <strong><code>13</code></strong> resolução: Cada número é igual à soma do número atual com o anterior</p>

    <p>f) 2,10, 12, 16, 17, 18, 19, <strong><code>200</code></strong> resolução: A lógica é que todos os numeros começam com a letra D</p>
    

4. Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

    Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?


    ```
    - Ligo o primeiro interruptor por um curto período de tempo;
    - Desligo o primeiro interruptor;
    - Ligo o segundo interruptor e mantenho ligado;
    - Não altero o terceiro interruptor durante este processo;
    
    - Entro na sala das lâmpadas;
    - Se a lâmpada estiver acesa:
      - Identifico o segundo interruptor como controlador da lâmpada;
    - Se a lâmpada estiver apagada:
      - Verifico a temperatura da lâmpada:
        - Se estiver aquecida:
          - Identifico o primeiro interruptor como controlador da lâmpada;
        - Se não estiver aquecida:
          - Identifico o terceiro interruptor como controlador da lâmpada;
    ```


5. Escreva um programa que inverta os caracteres de um string.

    <p>IMPORTANTE:</p>
    <p> a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;</p>
    <p>b) Evite usar funções prontas, como, por exemplo, reverse;</p>

    [Resposta 5](https://github.com/Nizoszz/desafio_target_sistemas/blob/master/reverse_string/src/main/java/com/targetsistemas/reverse_string/ReverseStringApplication.java)
