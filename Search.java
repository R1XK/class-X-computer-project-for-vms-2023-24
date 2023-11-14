class Search {
    String a, b;

    Search(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void find1() {
        System.out.print("Common words are: ");

        for (int i = 0; i < a.length(); i++) {
            // Extract word from sentence A
            String Aword = "";
            while (i < a.length() && a.charAt(i) != ' ') {
                Aword = Aword + a.charAt(i);
                i++;
            }

            // Reset index for sentence B
            int j = 0;

            // Process words from sentence B
            while (j < b.length()) {
                String Bword = "";

                // Extract word from sentence B
                while (j < b.length() && b.charAt(j) != ' ') {
                    Bword = Bword + b.charAt(j);
                    j++;
                }

                // Compare and print common words
                if (Aword.equalsIgnoreCase(Bword)) {
                    System.out.print(Aword + " ");
                }

                j++; // Move to the next character in sentence B
            }
        }
    }

    public void find2() {
    int maxLen = 0;
    String longestWords = "";

    for (int i = 0; i < a.length(); i++) {
        String word = "";
        while (i < a.length() && a.charAt(i) != ' ') {
            word += a.charAt(i);
            i++;
        }

        int wordLen = word.length();

        if (wordLen > maxLen) {
            maxLen = wordLen;
            longestWords = word + " ";
        } else if (wordLen == maxLen) {
            longestWords += word + " ";
        }
    }

    System.out.print("Longest words are: " + longestWords.trim());
}


    public static void test() {
        Search obj = new Search("the quick brown fox jumps", "fox jumped over the lazy dog");
        obj.find1();
        System.out.println();
        obj.find2();
    }

    public static void main(String[] args) {
        test();
    }
}