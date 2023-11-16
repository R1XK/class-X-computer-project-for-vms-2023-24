import java.util.Scanner;

public class Question17 {
    String a[], b[];

    public void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int len = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            a = new String[len];
            b = new String[len];

            System.out.println("Enter " + len + " words: ");
            for (int i = 0; i < len; i++) {
                a[i] = sc.nextLine();
            }
        }
    }

    public String convert(String str) {
        String vowels = "aeiouAEIOU";
        int index = 0;

        // Find the index of the first non-vowel character
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                index = i;
                break;
            }
        }

        if (index == 0) {
            return str;
        } else {
            // Move the consonant cluster to the end and add "ay"
            String pigStr = str.substring(index) + str.substring(0, index) + "ay";
            return pigStr;
        }
    }

    public void change() {
        for (int i = 0; i < a.length; i++) {
            b[i] = convert(a[i]);
        }
    }

    public void display() {
      System.out.print("Original: ");
      for (int i=0; i < a.length; i++) {
        System.out.print(a[i] + " ");
      }
      System.out.print("\nConverted: ");
      for (int i=0; i < b.length; i++) {
        System.out.print(b[i] + " ");
      }
    }

    public static void main(String[] args) {
        Question17 obj = new Question17();
        obj.input();
        obj.change();
        System.out.println();
        obj.display();
    }
}
