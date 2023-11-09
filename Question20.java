import java.util.Scanner;

public class Question20 {
    int a[];
    int b[][];
    int row, col;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        row = sc.nextInt();
        col = sc.nextInt();

        b = new int[row][col];

        System.out.println("Enter elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    public void sort() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public void extract() {

        a = new int[col]; 

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[j] = b[i][j];
            }

            sort();

            for (int j = 0; j < col; j++) {
                b[i][j] = a[j];
            }
        }

    }

    public void display(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void square(){
        if(col==row){
            System.out.println("It is Square Matrix\n");

            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if (i==j || j==col || j==col-i-1){ 
                        System.out.print(b[i][j]);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
        else{
            System.out.println("It is Not Square Matrix"); 
        }
    }

    public static void main(String[] args) {
        Question20 obj = new Question20();
        obj.input();
        System.out.println();
        obj.square();
        System.out.println("");
        obj.extract();
        System.out.println("Sorted Matrix:\n");
        obj.display();

     
    }
}
