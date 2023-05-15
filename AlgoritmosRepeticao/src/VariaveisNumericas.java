public class VariaveisNumericas {
    public static void main(String[] args) {

        // Operador de incremento 1: ++
        // Operador de decremento 1: --
        // esquerda > ++<variavel> --<variavel> : Incrementa junto com a leitura
        // direita > <variavel>++ <variavel>-- : Executar a leitura depois incrementar

        // Operador de atribuição com incremento ou decremento
        // += > Soma o valor passado a variavel: <variavel> += 10;
        // -= > Subtrai o valor passado a variavel: <variavel> -= 10;
        
        int numero;

        numero = 10;

        // Atribuindo um novo valor somando o valor antigo + 5
        numero = numero + 5;

        System.out.println(numero);

        numero += 5;

        System.out.println(numero);

        numero -= 5;

        System.out.println(numero);





    }
}
