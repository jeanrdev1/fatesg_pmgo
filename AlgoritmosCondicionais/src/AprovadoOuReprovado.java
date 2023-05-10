import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        // Algoritmo que lê 3 notas do aluno e retorna aprovado, recuperação ou reprovado
        // ps: A nota maxima devera ser 10

        // Ler 3 inputs do usuario e salvar nas variaveis nota1, nota2 e nota3
        // Calcular a média das notas
        // Se for menor que 5: ALUNO REPROVADO
        // Se for menor que 6: ALUNO EM RECUPERACAO
        // Caso contrario: ALUNO APROVADO

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a N1: ");
        float nota1 = Float.parseFloat(sc.next().replace(',', '.'));
        if (nota1 > 10) {
            System.out.println("Nota Invalida");
            nota1 = 10;
        }
        System.out.print("Digite a N2: ");
        float nota2 = Float.parseFloat(sc.next().replace(',', '.'));
        if (nota2 > 10) {
            System.out.println("Nota Invalida");
            nota2 = 10;
        }
        System.out.print("Digite a N3: ");
        float nota3 = Float.parseFloat(sc.next().replace(',', '.'));
        if (nota3 > 10) {
            System.out.println("Nota Invalida");
            nota3 = 10;
        }

        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media: " + media);

        if (media < 5) {
            System.out.println("ALUNO REPROVADO");
        } else if (media < 6) {
            System.out.println("ALUNO EM RECUPERACAO");
        } else {
            System.out.println("ALUNO APROVADO");
        }

        sc.close();
    }
}
