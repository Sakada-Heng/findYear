package findYear;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// declare constant variable
        final int minInHour= 60;
        final int hoursInDay= 24;
        final int daysInYear= 365;

        // Prompt user to input
        System.out.println("Enter the number of minutes: ");
        int min = input.nextInt();

        // Calculate number of years
        int years = min / minInHour / hoursInDay / daysInYear;
        // Calculate number of days after the year
        int days = min / minInHour / hoursInDay % daysInYear;
        System.out.println(min + "minutes is approximately" + years + "years and " + days + "days");
        input.close();
    }
}