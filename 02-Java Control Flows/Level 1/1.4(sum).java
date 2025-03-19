import java.lang.*;
import java.util.*;
class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int n;
        double sum=0;
        while(true)
        {
            System.out.println("Enter a number");
            n = sc.nextInt();
            double[] valuesTable=new double[10];
            if(n<=0)
            {
                break;
            }
            else if(n>0)
            {
                valuesTable[i]=n;
                System.out.println(n);
                sum+=n;
                System.out.println(sum);
                i++;
            }
        }
        System.out.println("Final sum of all entered numbers: " + sum);

    }
}