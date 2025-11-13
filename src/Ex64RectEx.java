class Rect64 {
    int width, height;

    public Rect64(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rect64) {
            Rect64 r = (Rect64) obj;
            return this.width * this.height == r.width * r.height;
        }
        return false;
    }
}

public class Ex64RectEx {
    public static void main(String[] args) {
        Rect64 a = new Rect64(2, 3);
        Rect64 b = new Rect64(3, 2);
        Rect64 c = new Rect64(3, 4);
        
        if(a.equals(b)) System.out.println("a.equals(b)");
        if(a.equals(c)) System.out.println("a.equals(c)");
        if(b.equals(c)) System.out.println("b.equals(c)");
    }
}
