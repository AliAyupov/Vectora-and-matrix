import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class R3Vector {
    private static int language;
    private static int n=0;
    Scanner in = new Scanner(System.in);
    private double x;
    private double y;
    private double z;

    public R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public R3Vector() {
        n++;
        if(n==1) {
            System.out.println("Выберите язык/Choose your languge:1-Русский,2-English");
            language = in.nextInt();
        }
        if(language==1)
        System.out.println("Введите координаты вектора:");
        if(language==2)
            System.out.println("Enter the coordinates of the vector");
        x=in.nextDouble();
        y=in.nextDouble();
        z=in.nextDouble();
    }
    public static void show(R3Vector a) {
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(a.z);
    }

    public static R3Vector plus(R3Vector a, R3Vector b) {
        if(language==1)
        System.out.println("Сложение:" );
        if(language==2)
            System.out.println("Addition");
        return new R3Vector(a.x + b.x , a.y + b.y , a.z + b.z );

    }

    public static R3Vector minus(R3Vector a, R3Vector b) {
        if(language==1)
        System.out.println("Вычитание:");
        if(language==2)
            System.out.println("Subtraction");
        return new R3Vector(a.x - b.x, a.y - b.y, a.z - b.z);
    }
    public static R3Vector mult(R3Vector a, double k) {
        if(language==1)
            System.out.println("Умножение на число:");
        if(language==2)
            System.out.println("Multiplying by the number");
        return new R3Vector(k*a.x,k*a.y,k*a.z );
    }
    public static double scal(R3Vector a,R3Vector b) {
        if(language==1)
            System.out.println("Скалярное произведение:");
        if(language==2)
            System.out.println("Scalar product");
        return a.x*b.x+a.y*b.y+a.z*b.y;
    }
    public static R3Vector vector(R3Vector a, R3Vector b) {
        if(language==1)
            System.out.println("Векторное произведение:");
        if(language==2)
            System.out.println("Vector product");
        return new R3Vector(a.y*b.z-b.y*a.z,a.x*b.z-b.x*a.z,a.x*b.y-b.x*a.y);
    }
    public static double  smech(R3Vector a,R3Vector b,R3Vector c) {
        if(language==1)
            System.out.println("Смешанное произведение:");
        if(language==2)
            System.out.println("Mixed product");
        return a.x*b.y*c.z+a.y*b.z*c.x+b.x*c.y*a.z-c.x*b.y*a.z-b.x*a.y*c.z-c.y*b.z*a.x;
    }
}
