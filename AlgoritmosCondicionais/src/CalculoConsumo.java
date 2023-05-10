import java.util.Scanner;

public class CalculoConsumo {
    public static void main(String[] args) {
        // Calcular consumo de combustivel do carro

        // Pegar input da kilometragem quando entrar na reserva
        // input litros abastecidos
        // input kilometragem quando entrou na reserva novamente
        // subtrair a km inicial da atual obter quantos km o carro andou
        // dividir a quantidade de km pela quantidade de litros

        Scanner sc = new Scanner(System.in);

        System.out.print("Kilometragem Abastecimento: ");
        float kmInicial = sc.nextInt();
        System.out.print("Litros Abastecidos: ");
        float litros = sc.nextInt();
        System.out.print("Kilometragem Atual: ");
        float kmAtual = sc.nextInt();

        float kms = kmAtual - kmInicial;

        float kml = kms / litros;
        
        System.out.println(String.format("KMs p/l: %.1f", kml));

        sc.close();
    }
}
