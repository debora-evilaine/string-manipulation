package co.reverse.string;

public class ReverseString {

    public static String reverseString(String stringToBeReversed){
        /* EXPLICAÇÃO:
        * Primeiro, criamos uma nova String vazia, que armazenará
        * o valor invertido da String recebida. Depois, fazemos um loop
        * que segue a seguinte lógica:
        *
        * o índice i começa da última posição da String e vai até a primeira,
        * ou seja, percorre a String de trás para frente.
        * Fizemos length()-1 porque o índice de qualquer String sempre
        * será 1 casa menor do que a quantidade de letras na String em si,
        * isso porque o nosso index começa do 0, e a função length retorna o TAMANHO da String em
        * quantidade de elementos, e não de índices.
        * Isso significa dizer que na String "banana", por exemplo,
        * o número de posições é 5, mesmo o número de letras sendo 6.
        * O mesmo ocorre com qualquer outra palavra.
        *
        * A questão aqui não é o loop sem si; mas sim o que
        * fazemos com ele. Na linha seguinte, utilizamos charAt(i), que
        * é uma função que trabalha obrigatoriamente com índices, então por isso
        * devemos escrever o nosso for de modo que ele possa alcançar todos os índices
        * da palavra fornecida. Observe, portanto, que a razão pelo qual fazemos
        * length()-1 é porque o valor de length é a quantidade de letras na palavra, não
        * a quantidade de índices, que sempre é length-1 em relação ao tamanho da palavra.*/

        String reversedString = "";
        for(int i = stringToBeReversed.length()-1; i >= 0; i--){
            reversedString += stringToBeReversed.charAt(i);
        }
        return reversedString;
    }
}
