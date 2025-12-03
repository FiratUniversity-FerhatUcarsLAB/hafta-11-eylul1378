public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + "," + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + "," + day);
    }

    public static void main(String[] args) {
        String day = "Monday";
        String month = "January";
        int date = 1;
        int year = 2024;

        System.out.println("American Formatı:");
        printAmerican(day, date, month, year);

        System.out.println("\nAvrupa Formatı:");
        printEuropean(day, date, month, year);
    }
}
