import java.util.Scanner;

class Time {
    int hh;
    int mm;

    Time() {    // default constructor
        hh = 0;
        mm = 0;
    }

    public void readTime() {     // takes time as input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time: ");
        hh = sc.nextInt();
        mm = sc.nextInt();
    }

    public Time addTime(Time X) {
        Time res = new Time();  // resultant time

        res.mm = this.mm + X.mm;
        res.hh = this.hh + X.hh;

        if (res.mm >= 60) {
            res.hh += res.mm / 60;
            res.mm %= 60;
        }

        return res;
    }

    public Time diffTime(Time X) {
        Time res = new Time();  // resultant time

        res.hh = Math.abs(this.hh - X.hh);  // subtracting hours
        res.mm = Math.abs(this.mm - X.mm);  // subtracting minutes

        return res;
    }

    public void dispTime() {  // printing data members
        System.out.println(hh + " hours " + mm + " minutes");
    }

    public static void main(String[] args) {
        // creating objects
        Time A = new Time();
        Time B = new Time();

        // Inputting Time
        A.readTime();
        B.readTime();

        // Performing Operations
        Time sum = A.addTime(B);
        Time difference = A.diffTime(B);

        // Displaying output
        System.out.print("Sum: ");
        sum.dispTime();
        System.out.print("Difference: ");
        difference.dispTime();
    }
}
