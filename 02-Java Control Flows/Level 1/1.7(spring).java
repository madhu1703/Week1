import java.lang.*;
import java.util.*;
class springSeason
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int month;
        int date;
        System.out.println("Month and date");
        month=sc.nextInt();
        date=sc.nextInt();
        if ((month == 3 && date >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && date <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}