import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GeradorDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Numeros Por Cartela: ");
        int numerosPorCartela = sc.nextInt();

        System.out.print("Quantidade de Cartelas: ");
        int qt = sc.nextInt();

        for(int vez = 0; vez < qt; vez++) {
            int[] gerados = new int[numerosPorCartela];
            for (int numero = 0; numero < gerados.length; numero++) {
                int rnd = random.nextInt(1, 61);
                boolean alreadyExists = false;
                for (int i = 0; i < gerados.length; i++) {
                    if (gerados[i] == rnd) {
                        System.out.println("Cartela: " + (vez + 1));
                        alreadyExists = true;
                    }
                }
                if (!alreadyExists) {
                    gerados[numero] = rnd;
                } else {
                    numero--;
                }
            }

            Arrays.sort(gerados);
            
            System.out.printf("Cartela %d: %s\n", (vez+1), getString(gerados));
        }

        sc.close();
    }

    public static String getString(int[] array) {
        String result = "";

        for (int i = 0; i < array.length; i++) {

            if (i < array.length) {

                result += array[i] + ", ";

            } else {

                result += array[i];

            }
        }

        return result;
    }
}
