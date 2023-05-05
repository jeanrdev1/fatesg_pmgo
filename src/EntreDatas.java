import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EntreDatas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Data Inicial (dia/mes/ano): ");
        String dataInicial = scanner.next();

        LocalDate dateInicial = LocalDate.parse(dataInicial, formatter);

        LocalDate dateFinal;

        System.out.print("Utilizar data de hoje? s/n: ");

        if (scanner.next().toLowerCase().equals("s")) {
            dateFinal = LocalDate.now();
        } else {
            System.out.print("Data Final (dia/mes/ano): ");
            String dataFinal = scanner.next();
            dateFinal = LocalDate.parse(dataFinal, formatter);
        }

        System.out.println("Diferença em Dias: " + ChronoUnit.DAYS.between(dateInicial, dateFinal));
        System.out.println("Diferença em Meses: " + ChronoUnit.MONTHS.between(dateInicial, dateFinal));
        System.out.println("Diferença em Anos: " + ChronoUnit.YEARS.between(dateInicial, dateFinal));

        Period periodoEntre = Period.between(dateInicial, dateFinal);

        System.out.printf("Anos: %d, Meses: %d, Dias: %d", periodoEntre.getYears(), periodoEntre.getMonths(), periodoEntre.getDays());

        scanner.close();
    }
}
