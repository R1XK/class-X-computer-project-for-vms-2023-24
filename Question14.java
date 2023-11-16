import java.util.Scanner;

class Question14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter current date (dd):");
        int dd = sc.nextInt();

        System.out.println("Enter current month (mm):");
        int mm = sc.nextInt();

        System.out.println("Enter current year (yyyy):");
        int yyyy = sc.nextInt();

        System.out.println("Enter current day name:");
        String currentDayName = sc.nextLine();

        System.out.println("Enter number of days to subtract:");
        int daysToSubtract = sc.nextInt();

        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < daysToSubtract; i++) {
            dd--;
            if (dd == 0) {
                mm--;
                if (mm == 0) {
                    yyyy--;
                    mm = 12;
                }

                int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if ((yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0))
                    dd = 29;
                else
                    dd = daysInMonth[mm];
            }
        }

        int currentDayIndex = 0;
        for (int i = 0; i < dayNames.length; i++) {
            if (dayNames[i].equalsIgnoreCase(currentDayName)) {
                currentDayIndex = i;
            }
        }

        int previousDayIndex = (currentDayIndex - daysToSubtract) % 7;
        if (previousDayIndex < 0) {
            previousDayIndex += 7;
        }

        String previousDayName = dayNames[previousDayIndex];

        System.out.println("Previous Date: " + dd + "/" + mm + "/" + yyyy);
        System.out.println("Previous Day Name: " + previousDayName);
    }
}
