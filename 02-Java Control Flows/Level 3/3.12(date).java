import java.util.Scanner;

class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d, m, y, x, y0, m0, d0;

        System.out.println("Enter the date (day month year): ");

        // Reading day, month, and year from user input
        d = sc.nextInt();  // Day
        m = sc.nextInt();  // Month
        y = sc.nextInt();  // Year

        // Adjust for January and February
        y0 = y - (14 - m) / 12;

        // Century-based formula to adjust year
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Adjust month for January and February
        m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculate day of the week
        d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result (day of the week)
        switch (d0) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            default: System.out.println("Invalid day"); break;
        }
    }
}
