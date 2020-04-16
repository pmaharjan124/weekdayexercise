import java.util.Scanner;
public class WeekDayExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }

    // Get the name from the Week
      public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "It is Monday"; break;
            case 2: dayName = "It is Tuesday"; break;
            case 3: dayName = "It is Wednesday"; break;
            case 4: dayName = "It is Thursday"; break;
            case 5: dayName = "It is Friday"; break;
            case 6: dayName = "It is Saturday"; break;
            case 7: dayName = "It is Sunday"; break;
            default:dayName = "It is invalid day range";
        }

        return dayName;

    }
}

