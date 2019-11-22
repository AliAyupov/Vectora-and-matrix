import java.util.Scanner;

public class Matrix2 {
    Scanner in = new Scanner(System.in);
    private double x;
    private double y;
    private double x1;
    private double y1;

    public Matrix2(double x, double y, double x1,double y2) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1= y1;
    }

    public static void showw(Matrix2 n) {
        System.out.println(n.x);
        System.out.println(n.y);
        System.out.println(n.x1);
        System.out.println(n.y1);
    }
    public static Matrix2 pluss(Matrix2 n,Matrix2 m){
        return new Matrix2 (n.x+m.x,n.y+m.y,n.x1+m.x1,n.y1+m.y1);
    }
    public static Matrix2 diz(Matrix2 n,Matrix2 m){
        return new Matrix2 (n.x-m.x,n.y-m.y,n.x1-m.x1,n.y1-m.y1);
    }
    public static Matrix2 mull(Matrix2 n,Matrix2 m){
        return new Matrix2 (n.x*m.x,n.y*m.y,n.x1*m.x1,n.y1*m.y1);
    }
    public static Matrix2 koef(Matrix2 n,double k){
        return new Matrix2 (n.x*k,n.y*k,n.x1*k,n.y1*k);
    }
    public static double opredel(Matrix2 n) {
        return n.x*n.y1-n.y*n.x1;
    }
    public static Matrix2 obrat(Matrix2 n){
        return new Matrix2 (n.y1,n.x1,n.y,n.x);
    }
}