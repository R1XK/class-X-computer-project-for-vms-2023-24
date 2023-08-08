import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight and Letter Type(I/F)");
        int wght = sc.nextInt();
        char type = sc.next().charAt(0);

        int charge=0;

        if (type == 'I'){
            charge = wght<50? (20*wght) : wght>=50 && wght<70? (3*wght) : (5*wght);
        }
        else if (type == 'F'){
            charge = wght<50? (50*wght) : wght>=50 && wght<70? (5*wght) : (7*wght);
        }

        System.out.println("charge: Rs." + charge);

        sc.close();
    }
}


