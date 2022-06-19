import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculateAgeIn8 {
    
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1996, Month.OCTOBER, 15);
        Period period = Period.between(birthDate, today);

        System.out.println("Year: "+ period.getYears());
        System.out.println("Month: "+period.getMonths());
        System.out.println("Days: "+period.getDays());
               
    }
}
