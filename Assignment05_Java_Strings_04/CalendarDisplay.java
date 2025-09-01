import java.util.*;

public class CalendarDisplay {
    static String monthName(int m) {
        String[] months = {"January","February","March","April","May","June","July",
                           "August","September","October","November","December"};
        return months[m-1];
    }

    static int daysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeap(y)) return 29;
        return days[m-1];
    }

    static boolean isLeap(int y) {
        return (y%4==0 && y%100!=0) || (y%400==0);
    }


    static int firstDayOfMonth(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x  = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m)/12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7; 
        return d0;
    }

    static void printCalendar(int m, int y) {
        int first = firstDayOfMonth(1, m, y);
        int days = daysInMonth(m, y);

        System.out.printf("     %s %d%n", monthName(m), y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < first; i++) System.out.print("    ");
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((first + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        printCalendar(m, y);
    }
}

