import java.text.ParsException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator {
    
    private static Age calculatorAge(Date birthDate){
        int years = 0;
        int months = 0;
        int days = 0;

        //Cteate calendar object for birth day
        Calendar birthDay = java.util.Calendar.getInstance();
        birthDay.setTimeInMillis(birthDate.getTime());

        //Create Calendar object for current day
        long currentTime = System.currentTimeMillis();
        Calendar now = Calendar.getInstance();
        now.setTimeInMillis(currentTime);

        //get differnce between years
        years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
        int currentMonth = now.get(Calendar.MONTH) + 1;
        int birtgMonth = birthDay.get(Calendar.MONTH) + 1;

        //Get Difference between months
        months = currentMonth - birtgMonth;

        //if month difference is in negative then reduce year by one
        //And calculate the number of month
        if(months < 0){
            years --;
            months = 12 - birtgMonth + currentMonth;
            if(now.get(Calendar.DATE) < birthDay.get(Calendar.DATE)){
                months --;
            }

        }else if(months == 0 && now.get(Calendar.DATE) < birthDay.get(Calendar.DATE)){

        }

    }
}
