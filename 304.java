import java.util.Scanner;

class was{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x=0,sum=0,count=0;
        while(x!=-1){
            sum+=x;
            count++;
            System.out.println("Please enter meal dollars -1 too stop:");
            x = sc.nextInt();
            
        }
        System.out.println("餐點總費用:"+sum);
        System.out.printf("%d 道餐點總費用為: %f", count-1, (sum/(count-1))*1.0);
    }
    
}