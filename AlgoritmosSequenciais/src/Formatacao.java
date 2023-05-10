public class Formatacao {
    public static void main(String[] args) {
        // Estrutura algoritmo

        // 1-Declarar as variaveis
        // 2-Executar funções
        // 3-Retornar Resultado
        
        float valor = 12.542f;
        double valorTotal = 128.8974;

        System.out.println(valor);
        System.out.println(valorTotal);

        // Formatação
        // %s - String
        // %d - int
        // %f - float/double
        // %b - boolean

        String name = "Jean";
        int idade = 29;
        float altura = 1.92f;
        boolean casado = true;
        
        System.out.printf("Nome: %s  Idade: %d  Altura: %f  Casado: %b %n", name, idade, altura, casado);
        System.out.println(String.format("Nome: %s  Idade: %d  Altura: %.2f  Casado: %b", name, idade, altura, casado));
        System.out.println("TESTE");
    }
}
