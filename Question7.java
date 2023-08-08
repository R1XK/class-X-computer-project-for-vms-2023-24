import java.util.Scanner;

class Question7 {
    public static void Pattern1(int h) {
        /*
         * a.....a h=4 -> sp=5
         * ab...ba
         * abc.cba
         * abcdcba "." = space
         * 
         * a.......a h=5 -> sp=7
         * ab.....ba
         * abc...cba 1 h -> 0sp
         * abcd.dcba 2 h -> 1sp
         * abcdedcba 3 h -> 3sp
         * 4 h -> 5sp
         * 5 h -> 7sp
         */
        char ch = 'a';
        int m = h * 2 - 3;
        int n = 0;
        for (int i = 1; i <= h; i++) {
            if (i < h) {
                for (int lw = 1; lw <= i; lw++) { // left wing
                    System.out.print(ch);
                    ch++;
                }
                for (int sp = 1; sp <= (m - n); sp++) { // space printing
                    System.out.print(" ");
                }
                ch = (char) (ch - 1);
                for (int rw = 1; rw <= i; rw++) { // right wing
                    System.out.print(ch);
                    ch--;
                }

                // char reset, new line, and increments stuff
                ch = 'a';
                n += 2;
                System.out.println();
            } else {
                m += 2;
                for (int bl = 1; bl <= m; bl++) { // bottom line
                    if (bl < m / 2 + 1) {
                        System.out.print(ch);
                        ch++;
                    } else {
                        System.out.print(ch);
                        ch--;
                    }
                }
                System.out.println();
            }

        }

    }

    public static void Pattern2(int h) {
        /*
         * 1.23.4
         * 1.23.
         * 1.2
         * 1.
         */
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= (h - i); j++) {
                System.out.print(j);
                if (j == 1 || j == 3) {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose your option and input accordingly: \n<1>Pattern 1 \n<2>Pattern 2");
        int opt = sc.nextInt();
        switch(opt){
            case 1: Pattern1(sc.nextInt()); break;
            case 2: Pattern2(sc.nextInt()); break;
            default: System.out.println("Invalid");
        }
        sc.close();
    }
}
