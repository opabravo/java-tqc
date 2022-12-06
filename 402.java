import java.util.*;

class wasdwasdf{

    public static Scanner sc =new Scanner(System.in);

    static int loop(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }

    static int self_loop(int n, int sum){
        if(n==1) return sum;
        return self_loop(n-1, sum*n);
    }
    public static void main(String args[]){
        int n=0;
        
        while(true){
            System.out.print("Input n (0 <= n <= 16):");
            n = sc.nextInt();
            if((n>16)||(n<0)) break;
            System.out.printf("%d 的階層(尾端迴圈) = %d\n", n, self_loop(n,1));
            System.out.printf("%d 的階層(迴圈) = %d\n", n, loop(n));
        }
        
    }
}