public class Point {
    public float x;
    public float y;

    public void getPoint(float a, float b) {
        this.x = a;
        this.y = b;
    }

    public float distance(Point p, Point q) {
        float dist = (float) Math.sqrt((q.x - p.x) * (q.x - p.x) + (q.y - p.y) * (q.y - p.y));
        return dist;
    }

    public Point midPointCalc(Point p, Point q) {
        Point mp = new Point();
        float mpx = (p.x + q.x) / 2;
        float mpy = (p.y + q.y) / 2;
        mp.getPoint(mpx, mpy);
        return mp;
    }

    public void create() {
        Point p = new Point();
        Point q = new Point();

        p.getPoint(5f, 5f);
        q.getPoint(-5f, -5f);

        float distance = distance(p, q);
        Point midpoint = midPointCalc(p, q);

        System.out.println("distance: " + distance);
        System.out.println("midpoint : " + "(" + midpoint.x + "," + midpoint.y +")");
    }

    public static void main(String[] args) {
        Point obj = new Point();
        obj.create();
    }
}
