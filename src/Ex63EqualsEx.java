class Point63 {
    int x, y;

    Point63(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point63) {
            Point63 p = (Point63) obj;
            return this.x == p.x && this.y == p.y;
        }
        return false;
    }
}

public class Ex63EqualsEx {
    public static void main(String[] args) {
        Point63 a = new Point63(2, 3);
        Point63 b = new Point63(2, 3);
        Point63 c = new Point63(3, 4);
        
        if(a == b) System.out.println("a==b");
        if(a.equals(b)) System.out.println("a.equals(b)");
        if(a.equals(c)) System.out.println("a.equals(c)");
    }
    
}
