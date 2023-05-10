import java.time.LocalTime;

public class HoraDoDia {
    public static void main(String[] args) {
        // Pegar a data e hora do sistema
        // Retornar ao usuario se é Bom Dia, Boa Tarde ou Boa Noite

        // if(condição1) {
        //     <se a condição1 for verdadeira>
        // } else if (condição2) {
        //     <se a condição2 for verdadeira>
        // } else {
        //     <se nenhuma das condições forem verdadeiras>
        // }

        LocalTime relogio = LocalTime.now();
        int hora = relogio.getHour();

        if (hora < 12) {
            System.out.println("Bom Dia!");
        } else if (hora < 18) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }
    }
}
