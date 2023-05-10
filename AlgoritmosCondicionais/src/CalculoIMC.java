import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        // Ler o input do peso e altura
        // Dividir o peso pela altura²
        // retornar em qual faixa a pessoa esta

        Scanner sc = new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        // Math.pow > Potencia
        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.printf("IMC: %.1f  Estagio: MAGREZA", imc);
        } else if (imc < 25) {
            System.out.printf("IMC: %.1f  Estagio: NORMAL", imc);
        } else if (imc < 30) {
            System.out.printf("IMC: %.1f  Estagio: SOBREPESO I", imc);
        } else if (imc < 40) {
            System.out.printf("IMC: %.1f  Estagio: OBESIDADE II", imc);
        } else {
            System.out.printf("IMC: %.1f  Estagio: OBESIDADE GRAVE	III", imc);
        }

        sc.close();
    }
}
