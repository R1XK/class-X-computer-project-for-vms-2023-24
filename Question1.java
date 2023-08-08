import java.util.Scanner;

public class Question1 {

    public static boolean chkPrime(int x) {
        int c = 0;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                c++;
            }
        }
        if (c>0)
            return false;
        else    
            return true;
    }

    public static boolean chkPal(int y) {
        int cpy = y;
        int pal = 0;
        while (cpy > 0) {
            int d = cpy % 10;
            pal = (pal*10) + d;
            cpy = cpy/ 10;
        }
        if (pal == y)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 limits for range: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (chkPal(i)==true && chkPrime(i)==true)
                System.out.println(i);
            else
                /* do nothing */;
        }

        sc.close();
    }
}
