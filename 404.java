import java.util.Scanner;
class awdsac {
    static Scanner sc = new Scanner(System.in);

    static int gcd(int m, int n){
      if(n==0) return m;
      return gcd(n,m%n);
    }
    public static void main(String[] args) {
      int m, n;
      while(true){
        System.out.print("Input m:");
        m = sc.nextInt();
        if(m==999) return;
        System.out.print("Input n:");
        n = sc.nextInt();
        
        

        System.out.println("最大公因數="+gcd(m,n));
      }
      
    }
}
