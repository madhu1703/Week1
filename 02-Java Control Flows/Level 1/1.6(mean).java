import java.lang.*;
import java.util.*;
class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr=new double[11];
        System.out.println("Enter the height of players");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextDouble();
        }
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        double mean=sum/arr.length;
        System.out.println(mean);
    }
}