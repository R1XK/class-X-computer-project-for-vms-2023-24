import java.util.Scanner;

class Question5{

    public static void pattern(int h){
        for (int i = 1; i<=h; i++){
            for (int j = 1; j<=i; j++)
                System.out.print(j);
            System.out.println("");
        }
    } 
    public static void pattern(int h, char m){
        for (int i = 1; i<=h; i++){
            for (int j = 1; j<=i; j++)
                System.out.print(m);
            System.out.println("");
        }
    } 
    public static void pattern(int a,int b, char c){
        for (int i = 1; i<=b; i++){
            for (int j = 1; j<= a; j++)
                System.out.print(c);
            System.out.println("");
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your option: \n <1> Number Right-angle Triangle \n <2> Charecter Right-angleTriangle \n <3> Charecter rectangle");
        int opt = sc.nextInt();

        System.out.println("Enter required fields: ");

        switch (opt){
            case 1: 
                pattern(sc.nextInt());
            break;

            case 2:
                pattern(sc.nextInt() , sc.next().charAt(0));
            break;

            case 3:
                pattern(sc.nextInt(), sc.nextInt(), sc.next().charAt(0));
            break;

            default:
                System.out.println("Invalid Option");
        }

        sc.close();
    }

}