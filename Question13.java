import java.util.Scanner;

public class Question13 {

    public static String sortWord(String word){
        String vowels = "";
        String consnt = "";
        String table = "AEIOUaeiou";

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(table.indexOf(ch) != -1)
                vowels = vowels + ch;
            else
                consnt = consnt + ch;
        }

        return(vowels+consnt);
    }

    public static void main(String[] args) {
        //input block
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String str = sc.nextLine();

        //intialisations
        String nstr = "";
        String word = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            while(Character.isLetter(ch) == true){
                word = word + ch;
                i++;
                ch = str.charAt(i);
                
                if(ch == ' ' || ch == '.' || ch == '!' || ch == '?')
                    break;
            }
            
            nstr = nstr + sortWord(word) + " ";
            word = "";
        }

        System.out.println("Input string: " + str + "\nOutput string: " + nstr);
        sc.close();
    }
}
