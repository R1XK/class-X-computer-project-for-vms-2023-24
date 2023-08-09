import java.util.Scanner;

public class Question6 {
    public static void series1(int n, int x) {
        double s = x;
        int c = -1, f = 1;
        for (int i = 2; i <= n; i++) {
            int fact = 1;

            for (int j = 1; j <= f; j++)
                fact *= j;

            s += (Math.pow(x, i) / fact) * c;

            f++;
            c += -1;
        }
        System.out.println(s);
    }

    public static void series(int a, int b) {
    int s = 0;
    boolean isFirst = true; // To track whether it's the first prime number

    for (int i = a; i <= b; i++) {
        int c = 0;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                c++;
                break; // Break as soon as we find a factor
            }
        }
        
        if (c == 0) {
            if (!isFirst) {
                System.out.print("+"); // Print "+" for all primes except the first one
            } else {
                isFirst = false;
            }
            
            s += i;
            System.out.print(i);
        }
    }
        System.out.println("=" + s);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter option: \n <1> Series 1 \n <2> Series 2");
        int opt = sc.nextInt();
        
        System.out.println("Enter required fields: ");

        switch (opt){
            case 1:
                series1(sc.nextInt(), sc.nextInt());
            break;

            case 2:
                series(sc.nextInt(), sc.nextInt());
            break;

            default:
                System.out.println("Invalid Option");
        }

        sc.close();
    }
}
