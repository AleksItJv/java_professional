package homework_6.task3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DataClass {

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime date = LocalDateTime.of(1986, 03, 16, 23, 40, 05 );
        Period period = getPeriod(start, date);
        System.out.println(period);
        System.out.println("Вам исполнилось" + date.getDayOfYear() + "лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд");
    }

    private static Period getPeriod(LocalDateTime dob, LocalDateTime now) {
        return Period.between(dob.toLocalDate(), now.toLocalDate());
    }

}
