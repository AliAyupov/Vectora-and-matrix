public class Main {
    public static void main(String []args){

        R3Vector a =new R3Vector(3,2,1);
        R3Vector b =new R3Vector(1,1,1);
        R3Vector c =new R3Vector(3,1,1);
        Matrix2 n=new Matrix2(1,0,2,3);
        Matrix2 m=new Matrix2(2,3,1,3);
        System.out.println("Сложение:" );
        R3Vector.show(R3Vector.plus(a,b));
        System.out.println("Вычитание:");
        R3Vector.show(R3Vector.minus(a,b));
        System.out.println("Умножение на число");
        R3Vector.show(R3Vector.mult(a,2));
        System.out.println("Скалярное произведение:"+R3Vector.scal(a,b));
        System.out.println("Векторное произведение:");
        R3Vector.show(R3Vector.vector(a,b));
        System.out.println("Смешанное произведение:"+R3Vector.smech(a,b,c));
        System.out.println("Сумма матриц");
        Matrix2.showw(Matrix2.pluss(n,m));
        System.out.println("Разность матриц");
        Matrix2.showw(Matrix2.diz(n,m));
        System.out.println("Перемножение матриц");
        Matrix2.showw(Matrix2.mull(n,m));
        System.out.println("Умножение  матрицы на коэф");
        Matrix2.showw(Matrix2.koef(n,3));
    }
}
