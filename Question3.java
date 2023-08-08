public class Question3 {
    public static void main(String[] args) {
        System.out.println("\t0deg\t30deg\t\t\t45deg\t\t\t60deg\t\t\t90deg");
        for (int i=1; i<=3; i++){
            int theta = 0;
            System.out.print(i==1? "sin:\t" : i==2? "cos:\t" : "tan:\t");
            for (int j=1; j<=5; j++){
                // 0 - 30 - 45 - 60 - 90
                
                if (i==1)
                    System.out.print(Math.sin(theta) + "\t");  
                else if (i==2)
                    System.out.print(Math.cos(theta) + "\t");
                else 
                    System.out.print(Math.tan(theta) + "\t");

                if (j!=1 || j!=5)
                    theta+=15; 
                else
                    theta+=30; 

                
            }
            System.out.println("");
        }
    }
}


