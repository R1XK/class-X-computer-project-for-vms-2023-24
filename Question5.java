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
        System.out.println("Pattern 1: ");
        pattern(5);
        System.out.println();
        System.out.println("Pattern 2: ");
        pattern(4, '#');
        System.out.println();
        System.out.println("Pattern 3: ");
        pattern(7, 3, '#');

    }

}
