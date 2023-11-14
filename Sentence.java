import java.util.Scanner;

public class Sentence {
    String sen, arr[];

    Sentence(String str) {
        sen = str;
        int c = 1; // Initialize to 1 to account for the last word
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                c++;
        }
        arr = new String[c];
    }

    public void extract() {
        String word = "";
        int index = 0;
        for (int i = 0; i < sen.length(); i++) {
            while (i < sen.length() && sen.charAt(i) != ' ') {
                word = word + sen.charAt(i);
                i++;
            }
            arr[index] = word;
            index++;
            word = "";
        }
    }

    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void search(String key) {
        int first = 0;
        int last = arr.length - 1;
        int mid;

        while (last >= first) {
            mid = (first + last) / 2;
            int res = key.compareToIgnoreCase(arr[mid]);

            if (res == 0) {
                System.out.println(key + " found at index: " + mid);
                return;
            }

            if (res > 0)
                first = mid + 1;
            else
                last = mid - 1;
        }
        System.out.println(key + " not found");
    }

    public static void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        Sentence obj = new Sentence(sc.nextLine());

        obj.extract();
        obj.sort();

        System.out.println("Enter word to search: ");
        obj.search(sc.nextLine());
    }

    public static void main(String[] args) {
        create();
    }
}
