import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HoraDoSistema {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        System.out.println(dateFormat.format(dateTime));

        if (dateTime.getHour() < 12) {
            System.out.println("Bom Dia");
        } else if (dateTime.getHour() < 18) {
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }
    }
}
