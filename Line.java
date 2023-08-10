public class Line{
    int x1, y1;
    int x2, y2;
    double distance;

    public Line(){
        x1=0; y1=0;
        x2=0; y2=0;
    }

    public Line(int x1, int y1, int x2, int y2){
        this.x1=x1; this.y1=y1;
        this.x2=x2; this.y2=y2;
    }

    public void distance() {
        distance = (double) Math.sqrt((this.x2 - this.x1) * (this.x2 - this.x1) + (this.y2 - y1) * (this.y2 - this.y1));
        System.out.println("distance: " + distance);
    }

    public void midPoint() {
        double mpx = (x1 + x2) / 2;
        double mpy = (y1 + y2) / 2;
        System.out.println("midpoint: (" + mpx + "," + mpy + ")");
    }

    public void display(){
        System.out.println("Points: (" + x1 + "," + y1 + ")" + ", (" + x2 + "," + y2 + ")");
        distance();
        midPoint();
    }

    public Line compare(Line p, Line q){
        return p.distance > q.distance? p : q;
    }
    public static void main(String[] args) {
        Line PQ = new Line(5, 5, -5, -5);
        Line AB = new Line(-6, -6, 6, 6);

        System.out.println("For line PQ: ");
        PQ.display();

        System.out.println();

        System.out.println("For line AB: ");
        AB.display();

        System.out.println();

        Line maxLine = PQ.compare(PQ, AB);
        System.out.println("The longer line is:");
        maxLine.display();
        
    }
}
