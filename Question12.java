public class Question12 {

    public static void find() {
        int n = 42586;
        System.out.println(n);
        String num = Integer.toString(n);
        int flag = 0; // flags

        for (int i = 0; i < (num.length() / 2) + 1; i++) {
            int le = Character.getNumericValue(num.charAt(i));
            int re = Character.getNumericValue(num.charAt(num.length() - 1 - i));

            System.out.println(le + " + " + re + " = " + (le + re));

            if (le + re != 10) {
                flag++;
            }
        }

        System.out.println(flag > 0 ? "It is not upside-down num" : "It is upside-down num");
    }

    public static void find(int n) { // twin prime series
        double s = 0.0;
        int nums1 = 3;
        int nums2 = 5;
        int i = 1;

        while (i <= n) {
            // prime checking
            int c1 = 0;
            int c2 = 0;

            for (int pr1 = 2; pr1 <= nums1 / 2; pr1++)
                c1 = nums1 % pr1 == 0 ? c1 + 1 : c1;

            for (int pr2 = 2; pr2 <= nums2 / 2; pr2++)
                c2 = nums2 % pr2 == 0 ? c2 + 1 : c2;

            if(c1 == 0 && c2 == 0){
                s += nums1/nums2;
                i++;
            }

            // increments
            nums1 += 2;
            nums2 =+ 2;
        }

        System.out.println("sum of series is: " + s);
    }

    public static void find(String g) { // pattern printing
        for (int i = 0; i < g.length(); i++) {
            System.out.println(g.substring(i));
        }
    }

    public static void main(String[] args) {
        find();
        System.out.println("\n");
        find(4);
        System.out.println("\n");
        find("RIZZLER");
    }
}
