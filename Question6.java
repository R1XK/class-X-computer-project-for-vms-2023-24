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

    public static void series(int a,int b){
        int s=0;
        for (int i=a; i<=b; i++){
            int p=0, c=0;
            for (int j=2; j<=i/2;j++){
                if (i%j==0)
                    c++;
            }
            p = c!=0? 0 : i;
            s+=p;
        }
        System.out.println(s);
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
