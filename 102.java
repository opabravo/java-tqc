import java.util.*;

class JPD01 {

    public static void main(String args[]){
        int x;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Please input:");
        x= sc.nextInt();
        System.out.printf("%f kg = %f ponds", x*1.0, x*1.0*2.20462);
    }
    
}
