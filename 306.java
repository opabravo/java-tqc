import java.util.Scanner;

class wasawdwas{

    public static Scanner sc = new Scanner(System.in);

    static long test(int m, int n){
        long total = 1;
        while(n>0){
            total*=m;
            n--;
        }
        return total;
    }
    public static void main(String[] args) {
        int m,n;
        while(true){
            System.out.println("Input:");
            m = sc.nextInt();
            n = sc.nextInt();
            if(m==-1) break;

            System.out.println(test(m,n));
            
        }
    }
    
}