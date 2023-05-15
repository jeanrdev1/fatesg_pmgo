import java.util.Scanner;

public class PrimeiroFOR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas vezes deseja rodar o loop: ");
        int quantidade = sc.nextInt();
        
        for (int i = 0; i < quantidade; i++) {

            System.out.println("Nome Do Aluno 'Somente primeiro nome': ");
            String nome = sc.nextLine();
            nome = sc.nextLine();

            System.out.println("Media Final: ");
            double nf = sc.nextDouble();

            System.out.println("Nome: " + nome + "  NF: " + nf);

        }

        sc.close();
    }
}
