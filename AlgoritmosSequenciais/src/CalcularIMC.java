public class CalcularIMC {
    public static void main(String[] args) {
        float peso = 83.5f;
        float altura = 1.92f;

        float imc = peso / (altura * altura);

        // println = Imprime o texto no console e quebra a linha
        // print/printf = Imprime o texto no console
        // Para quebar linha em uma string utilizar \n

        System.out.printf("Valor IMC: %.2f\n", imc);

        System.out.println("Valor IMC: " + imc);
    }
}
