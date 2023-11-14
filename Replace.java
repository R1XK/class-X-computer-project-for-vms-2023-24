import java.util.Scanner;

public class Replace {
    String S, rev, tem, ns;

    Replace() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        S = sc.nextLine();

        rev = "";
        tem = "";
        ns = "";
    }

    public String reverse(String b) {
        rev = "";
        for (int i = b.length() - 1; i >= 0; i--) {
            rev = rev + b.charAt(i);
        }
        return rev;
    }

    public void change() {
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            while (i < S.length() && (ch != ' ' && ch != '.' && ch != '?' && ch != '!')) {
                tem = tem + S.charAt(i);
                i++;
                if (i < S.length()) {
                    ch = S.charAt(i);
                }
            }
            ns = ns + reverse(tem) + " ";
            tem = "";
        }

        ns = ns.trim();
        ns = ns + S.charAt(S.length() - 1);

        System.out.println("Original String: " + S);
        System.out.println("New String: " + ns);
    }

    public static void main(String[] args) {
        Replace obj = new Replace();
        System.out.println();
        obj.change();
    }
}
