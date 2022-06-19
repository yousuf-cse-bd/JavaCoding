import java.time.LocalDate;
import java.time.Period;

public class JodatimeLibrary{
    public static void main(String[] args) {
        
        LocalDate birthDate = new LacalDate(1996, 10, 15);
        LocalDate now = new LocalDate();

        Period period = new Period(birthDate, now, PeriodType.yearMonthDay());

        //Now Access the values as below:

        System.out.println("Days: "+period.getDays());
        System.out.println("Month: "+period.getMonths());
        System.out.println("Year: "+period.getYears());
    }
}