import java.util.Scanner;

public class Question18 {
    static String a, b;

    Question18(String str) {
        a = str;
        b = "";
    }

    public void change() {
        a = a.toLowerCase();
        String vowels = "aeiou";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (vowels.indexOf(ch) == -1 && ch != ' ')
                ch = (char) (ch + 3);
            else
                ch = (char) (ch + 2);

            if ((int) ch > 122) {
                ch = (char) (97 + (ch - 122));
            }

            b = b + ch;
        }
    }

    public static void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        Question18 obj = new Question18(sc.nextLine());

        obj.change();
        System.out.println("original sentence: " + a);
        System.out.println("encrypted sentence: " + b);
    }

    public static void main(String[] args) {
        create();
    }
}
