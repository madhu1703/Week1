import java.util.Scanner;

class L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = 0;
        double n;
		while (true) {
            System.out.println("Enter a number (0 to stop):");
            n = sc.nextDouble();
            if (n == 0) {
                System.out.println(0);
            }
            else {
                f += n;
                System.out.println(f);
            }
        }

    }
}
