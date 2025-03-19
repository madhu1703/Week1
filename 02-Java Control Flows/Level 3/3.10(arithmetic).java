import java.lang.*;
import java.util.*;
class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        String op;
        System.out.println("Enter the numbers and operation");
        a = sc.nextInt();
        b = sc.nextInt();
        op=sc.next();

        switch (op){
            case "+":
                System.out.println(a+b);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "x" :
                System.out.println(a*b);
                break;
            case"/" :
                System.out.println(a/b);
                break;
            default : System.out.println("invalid");


        }
    }
}