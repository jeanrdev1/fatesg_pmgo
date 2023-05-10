import java.util.Scanner;

public class PortaDeBalada {
    public static void main(String[] args) {
        // Permitir a entrada caso tenha 18 anos ou mais, caso contrario barrar a pessoa

        // criar uma variavel: idade > para armazenar a idade que o usuario digitar
        // verificar se a idade é maior ou igual a 18
        // se for maior ou igual a 18 imprimir: ENTRADA PERMITIDA
        // se não imprimir: ENTRADA BLOQUEADA

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Idade: ");
        int idade = sc.nextInt();

        // if(condição) {
        //     <se a condição for verdadeira>
        // }

        // if(condição) {
        //     <se a condição for verdadeira>
        // } else {
        //     <se a condição for falsa>
        // }
        
        if (idade >= 18) {
            System.out.println("ENTRADA PERMITIDA");
        } else {
            System.out.println("ENTRADA BLOQUEADA");
        }
        
        sc.close();
    }
}
