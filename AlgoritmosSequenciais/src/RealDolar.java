import java.util.Scanner;

public class RealDolar {
    public static void main(String[] args) {
        // Instancia do objeto Scanner > Fazer leitura do input do usuario
        Scanner sc = new Scanner(System.in);

        // Mostrar o titulo do algoritmo na tela
        System.out.println("Compra de Dolar Online");

        // Declaração da taxa iof
        // Considerando que 1 equivale a 100% do valor e 0.5 equivale a 50%
        // % definida é de 6,38%
        float iof = 0.0638f;

        System.out.print("Valor Dolar: ");
        // Pegando o input da cotação e atribuindo a variavel: cotacao
        float cotacao = sc.nextFloat();

        System.out.print("Valor em R$: ");
        // Pegando o input do valor em reais e atribuindo a variavel: reais
        float reais = sc.nextFloat();

        // Dividindo o valor de reais pela cotação e atribuindo a variavel: valorCalculado
        float valorCalculado = reais / cotacao;

        // Multiplicando o valor calculado pela taxa do iof: pegando apenas 6.38% do valor e tribuindo a variavel: taxaIOF
        float taxaIOF = valorCalculado * iof;

        // Subtraindo a taxa de IOF do valor calculado diretamente sendo o valorCalculado - 6.38% 
        float valorRecebido = valorCalculado - taxaIOF;

        // Imprimindo na tela e fazendo a formatação
        System.out.printf("Valor Pago: R$%.2f\n", reais);
        System.out.printf("Calculo Direto: $%.2f\n", valorCalculado);
        System.out.printf("Taxa IOF: $%.2f\n", taxaIOF);
        System.out.printf("Valor Recebido : $%.2f\n", valorRecebido);

        // Finaliza o Scanner "JAVA PARAR DE RECLAMAR"
        sc.close();
    }
}
