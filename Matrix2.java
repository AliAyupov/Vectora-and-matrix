import java.util.Scanner;

public class Matrix2 {
    Scanner in = new Scanner(System.in);
    private double x;
    private double y;
    private double x1;
    private double y2;
    public Matrix2() {
        System.out.println("Введите матрицу");
        x=in.nextDouble();
        y=in.nextDouble();
        x1=in.nextDouble();
        y2=in.nextDouble();
    }
    public Matrix2(double x, double y, double x1, double y2) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y2 = y2;
    }

    public static void showw(Matrix2 n) {
        System.out.println("|"+n.x +" "+ n.y+"|");
        System.out.println("|"+n.x1 +" "+ n.y2+"|");
    }

    public static Matrix2 pluss(Matrix2 n, Matrix2 m) {
        System.out.println("Сложение");
        return new Matrix2(n.x + m.x, n.y + m.y, n.x1 + m.x1, n.y2 + m.y2);

    }

    public static Matrix2 diz(Matrix2 n, Matrix2 m) {
        System.out.println("Вычитание");
        return new Matrix2(n.x - m.x, n.y - m.y, n.x1 - m.x1, n.y2 - m.y2);
    }
    public static Matrix2 mull(Matrix2 n, Matrix2 m) {
        System.out.println("Перемножение");
        return new Matrix2(n.x * m.x, n.y * m.y, n.x1 * m.x1, n.y2 * m.y2);
    }
    public static Matrix2 koef(Matrix2 n, double k) {
        System.out.println("Умножение на число");
        return new Matrix2(n.x * k, n.y * k, n.x1 * k, n.y2 * k);
    }

    public static double opredel(Matrix2 n) {
        return n.x * n.y2 - n.y * n.x1;
    }

    public static Matrix2 obrat(Matrix2 n) {
        double det = n.x * n.y2 - n.y * n.x1;
        if (det == 0) {
            System.out.println("No");
        } else
            System.out.println("1 /"+ det);
            return new Matrix2(1 * n.y2, -1 * n.y, -1 * n.x1, 1 * n.x);

    }
}


