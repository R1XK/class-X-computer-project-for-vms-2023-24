public class Line{
    int x1, y1;
    int x2, y2;

    public Line(){
        x1=0; y1=0;
        x2=0; y2=0;
    }

    public Line(int x1, int y1, int x2, int y2){
        this.x1=x1; this.y1=y1;
        this.x2=x2; this.y2=y2;
    }

    public void distance() {
        double dist = (double) Math.sqrt((this.x2 - this.x1) * (this.x2 - this.x1) + (this.y2 - y1) * (this.y2 - this.y1));
        System.out.println("distance: " + dist);
    }

    public void midPoint() {
        double mpx = (x1 + x2) / 2;
        double mpy = (y1 + y2) / 2;
        System.out.println("midpoint: (" + mpx + "," + mpy + ")");
    }

    public void display(){
        System.out.println("Points: (" + x1 + "," + y1 + ")" + ", (" + x2 + "," + y2 + ")");
    }

    public Line compare(Line p, Line q){
        double distP = (float) Math.sqrt((p.x1 - p.x2) * (p.x1 - p.x2) + (p.y1 - p.y2) * (p.y1 - p.y2));
        double distQ = (float) Math.sqrt((q.x1 - q.x2) * (q.x1 - q.x2) + (q.y1 - q.y2) * (q.y1 - q.y2));

        return distP>distQ? p : q;
    }
    public static void main(String[] args) {
        Line PQ = new Line(5, 5, -5, -5);
        Line AB = new Line(-6, -6, 6, 6);

        System.out.println("For line PQ: ");
        PQ.display();
        PQ.distance();
        PQ.midPoint();

        System.out.println("For line AB: ");
        AB.display();
        AB.distance();
        AB.midPoint();

        Line maxLine = PQ.compare(PQ, AB);
        System.out.println("The longer line is:");
        maxLine.display();
        
    }
}
