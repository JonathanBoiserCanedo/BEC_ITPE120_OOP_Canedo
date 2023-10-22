public class DayOfWeekDemo {
    // Define an enum for days of the week
    enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.FRIDAY;

        // Use a switch statement to perform actions based on the day
        switch (day) {
            case SUNDAY:
                System.out.println("It's a relaxing day!");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a workday. Time to work!");
                break;
            case FRIDAY:
                System.out.println("It's Friday! Weekend is coming!");
                break;
            case SATURDAY:
                System.out.println("It's the weekend. Enjoy your free time!");
                break;
            default:
                System.out.println("Invalid day of the week.");
        }
    }
}
