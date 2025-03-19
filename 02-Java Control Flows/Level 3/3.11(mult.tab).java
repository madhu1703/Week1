import java.lang.*;
import java.util.*;
class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String op;
        System.out.println("Enter the number and operation");
        n = sc.nextInt();
        op=sc.next();
        for(int i=1; i<=n; i++)
            switch (op){
                case "+":
                    System.out.println(n+"+"+i+"="+ (n+i));
                    break;
                case "-" :
                    System.out.println(n+"-"+i+"="+ (n-i));
                    break;
                case "x" :
                    System.out.println(n+"x"+i+"="+ (n*i));
                    break;
                case"/" :
                    System.out.println(n+"/"+i+"="+ (n/i));
                    break;
                default : System.out.println("invalid");


            }
    }
}