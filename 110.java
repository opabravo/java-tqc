import java.util.Scanner;

class wwadaw {

    public static Scanner sc = new Scanner(System.in);
    public static double PI = 3.1415926;
    public static void main(String args[]) {
        System.out.printf("圓面積為: %f \n", calCircle(5));
        System.out.printf("三角形面積為 : %f \n",calTriangle(10, 5));
        System.out.printf("長方形面積為 : %f \n", calRectangle(5, 10));
        System.out.printf("此無形面積為 : %f \n",calCircle(5)+calTriangle(10, 5)+calRectangle(5, 10));
    }

    static double calCircle(int r){
        return r*r*PI;
    }

    static double calTriangle(int x, int y){
        return x*y/2;
    }

    static double calRectangle(int x, int y){
        return x*y;
    }
}
