import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um Numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(String.format("O numero: %d é par", numero));
        } else {
            System.out.printf("O numero: %d é ímpar\n", numero);
        }

        sc.close();
    }
}
