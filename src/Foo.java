// import java.util.Scanner;

public class Foo {
    public static void main(String[] args) {
        char startChar = 'A';

        do {
            System.out.print(startChar++ + " ");
        } while (startChar <= 'Z');
    }
}