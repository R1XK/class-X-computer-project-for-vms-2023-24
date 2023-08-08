public class Question9 {
    int a;
    int b;

    Question9() {
        a = 100;
        b = 999;
    }

    public int Sum(int x) {
        int sum = 0;
        while (x != 0) {
            int d = x % 10;
            sum += d * d * d;
            x /= 10;
        }
        return sum;
    }

    public void display() {
        for (int i = a; i <= b; i++) {
            if (i == Sum(i)){
                System.out.println(i);
            }   
        }
    }
    public static void main(String[] args) {
        Question9 obj =new Question9();
        obj.display();
    }
}
