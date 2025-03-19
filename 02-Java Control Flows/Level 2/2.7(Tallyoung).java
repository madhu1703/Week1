import java.lang.*;
import java.util.*;
class L2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int aam,aak,aan;
        int ham,hak,han;
        System.out.println("Enter the ages of Amar, Akbar, Anthony and heights of them");
        aam=sc.nextInt();
        aak=sc.nextInt();
        aan=sc.nextInt();
        ham=sc.nextInt();
        hak=sc.nextInt();
        han=sc.nextInt();
        if(aam<aak&&aam<aan)
        {
            System.out.println("Amar is the smallest among all");
        }
        else if(aak<aam&&aak<aan)
        {
            System.out.println("Akbar is the youngest");
        }
        else
            System.out.println("Anthony is the youngest");
        if(ham<hak&&ham<han)
        {
            System.out.println("Amar is the shortest");
        }
        else if(hak<ham&&hak<han)
        {
            System.out.println("Akbar is the shortest");
        }
        else
            System.out.println("Anthony is the shortest");
    }
}
