import java.util.Scanner;

class Asdw23 {
    static Scanner sc = new Scanner(System.in);

    static int doSum(int n){
        int x=0;
        for(int i=2; i<=n;i++){
            if(i%2!=0) continue;
            x+=i;
        }
        return x;
    }
    public static void main(String[] args) {
        int x;
        do{
            System.out.print("請輸入 n 的值(n > 0，且為偶數)：");
            x = sc.nextInt();
            if(x%2!=0) continue;
            if(x<0) continue;
            break;
        }
        while(true);

        System.out.println("2+4+6+...+n="+doSum(x));
    }
}