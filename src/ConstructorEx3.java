public class ConstructorEx3 {
    public static void main(String[] args) {
        B b = new B(5);
    }
}
class A {
    public A() {
        System.out.println("A 클래스의 생성자");
    }
    public A(int x) {
        System.out.println("A 클래스의 매개변수가 있는 생성자: " + x);
    }
}
class B extends A {
    public B() {
        System.out.println("B 클래스의 생성자");
    }
    public B(int x) {
        System.out.println("B 클래스의 매개변수가 있는 생성자: " + x);
    }
}