class Question8 {
    public static void series(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c= a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void series(int x, int n) {
        double s = 0.0;
        int c = 1;
        
        for (int i = 1; i <= n; i++) {
            int f = 1;
            for (int j = 1; j <= (i + 1); j++) {
                f *= j;
            }
            s += (double) ((x / f) * c); // Adding the term to the sum
        
            // Toggling c
            c *= -1;
        }
        System.out.println("result: " + s);
    }

    public static void main(String[] args) {
        series(5);
        series(10, 5);
    }
}