import java.util.*;

class JPD033 {
    public static void main(String args[]){
        int x1,y1,x2,y2;
        double distance;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入第1組的x和y座標:");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("請輸入第2組的x和y座標:");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("介於 (%f,%f) 和 (%f,%f)之間的距離是%.2f", x1*1.0,y1*1.0,x2*1.0,y2*1.0,distance);
    }

}

