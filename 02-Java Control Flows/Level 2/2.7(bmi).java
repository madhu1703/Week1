import java.lang.*;
import java.util.*;
class l2
{
    public static void main(String[]  args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of people");
        int n=sc.nextInt();
        double[][] personData = new double[n][3];
        double ht,wt,BMI;
        String[] weightStatus=new String[n];
        for(int i=0;i<n;i++){
        System.out.print("Enter weight (in kg): ");
        wt = sc.nextDouble();
        if (wt <= 0) {
            System.out.println("Please enter a positive value for weight");
        }
        System.out.print("Enter height (in cm): ");
        ht = sc.nextDouble();
        if (ht <= 0) {
            System.out.println("Please enter a positive value for height");
        }
        double m = ht / 100;
        BMI = wt / (m * m);
            personData[i][0] = wt;
            personData[i][1] = ht;
        if (BMI <= 18.4) {
            weightStatus[i] = "Underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            weightStatus[i] = "Normal weight";
        } else if (BMI >= 25 && BMI <= 39.9) {
            weightStatus[i] = "Overweight";
        } else {
            weightStatus[i] = "Obese";
        }
    }
        System.out.printf("%-10s %-12s %-12s %-10s %-15s\n", "Person", "Height (cm)", "Weight (kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %-15s\n", (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

    }
    }
