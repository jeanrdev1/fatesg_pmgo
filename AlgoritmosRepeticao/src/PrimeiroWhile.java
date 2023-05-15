public class PrimeiroWhile {
    public static void main(String[] args) {

        int contador = 0;

        // Enquanto o contador for menor que 10 faça
        while (contador < 10) {
            // imprime o valor do contador
            System.out.println(contador);

            // incrementa 1 ao contador
            contador++;
        }

        do {
            System.out.println(contador);
            contador++;
        } while (contador < 20);

        // WHILE: enquanto <condição for verdadeira> faça
        // while (condition) {

        // }

        // DO: faça <enquanto condição for verdadeira>
        // do {

        // } while (condition);

    }
}
