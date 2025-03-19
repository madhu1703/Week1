import java.lang.*;
import java.util.*;
class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] ht = new int[3];
        System.out.println("Enter the age and height of amar");
        age[0] = sc.nextInt();
        ht[0] = sc.nextInt();
        System.out.println("Enter the age and height of akbar");
        age[1] = sc.nextInt();
        ht[1] = sc.nextInt();
        System.out.println("Enter the age and height of anthony");
        age[2] = sc.nextInt();
        ht[2] = sc.nextInt();
        int youngestIndex = 0;
        for (int i = 0; i < 3; i++) {
            if (age[i] <= age[youngestIndex]) {
                youngestIndex = i;
            }
            break;
        }
        int tallestIndex = 0;
        for (int i = 0; i < 3; i++) {
            if (age[i] >= age[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("The youngest person is " + getName(youngestIndex));
        System.out.println("The tallest person is " + getName(tallestIndex));

    }

    public static String getName(int index) {
        switch (index) {
            case 0:
                return ("Amar");
            case 1:
                return ("Akbar");
            case 2:
                return ("Anthony");
            default:
                return ("Unknown");

        }
    }
}