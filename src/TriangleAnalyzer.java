import java.util.Scanner;

public class TriangleAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую сторону треугольника: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите вторую сторону треугольника: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите третью сторону треугольника: ");
        int c = Integer.parseInt(scanner.nextLine());

        scanner.close();

        if (isRightTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
        } else if (isIsoscelesTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
        } else if (isEquilateralTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");
        } else if (!isTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");
        } else {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника");
        }
    }

    //  прямоугольник
    private static boolean isRightTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b);
    }

    //  равнобедренный
    private static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || c == a;
    }

    //  равносторонний
    private static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    // могут ли три числа образовать треугольник
    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }
}
