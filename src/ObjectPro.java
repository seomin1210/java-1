class PointAsdf {
    private int x, y;

    public PointAsdf(int x, int y) {
        this.set(x, y);
    }
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }    
}

public class ObjectPro {
    public static void main(String[] args) {
        PointAsdf p = new PointAsdf(2, 3);
        System.out.println(p.getClass().getName());
        System.out.println(p.toString());
        System.out.println(p.hashCode());
    }
}
