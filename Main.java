public class Main {
    public static void main(String []args){

//        R3Vector a =new R3Vector( );
//        R3Vector b =new R3Vector();
//        R3Vector c =new R3Vector();
        Matrix2 n= new Matrix2();
        Matrix2 m = new Matrix2();
        Matrix2.showw(Matrix2.pluss(n,m));
        Matrix2.showw(Matrix2.diz(n,m));
        Matrix2.showw(Matrix2.mull(n,m));
        Matrix2.showw(Matrix2.koef(n,4));
        System.out.println("Определитель"+Matrix2.opredel(n));
        Matrix2.showw(Matrix2.obrat(n));

//        R3Vector.show(R3Vector.plus(a,b));
//        R3Vector.show(R3Vector.minus(a,b));
//        R3Vector.show(R3Vector.mult(a,2));
//        System.out.println(R3Vector.scal(a,b));
//        R3Vector.show(R3Vector.vector(a,b));
//        System.out.println(R3Vector.smech(a,b,c));

    }
}
