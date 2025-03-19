import java.util.Scanner;

class l2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[5];
        double[] weights = new double[5];
        double[] heights = new double[5];
        String[] statuses = new String[5];
        double BMI;
        double wt;
        double ht;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the weight and height of person " + (i + 1) + ":");
            wt = sc.nextDouble();
            ht = sc.nextDouble();
            weights[i] = wt;
            heights[i] = ht;
            double m = ht / 100;
            BMI = wt / (m * m);
            arr[i] = BMI;
            if (BMI <= 18.4) {
                statuses[i] = "Underweight";
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (BMI >= 25 && BMI <= 39.9) {
                statuses[i] = "Overweight";
            } else if (BMI >= 40) {
                statuses[i] = "Obese";
            }
        }
        System.out.println("\nAll persons' data:");
        System.out.printf("%-10s %-12s %-12s %-10s %-15s\n", "Person", "Height (cm)", "Weight (kg)", "BMI", "Status");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %-15s\n", (i + 1), heights[i], weights[i], arr[i], statuses[i]);
        }
    }
}
