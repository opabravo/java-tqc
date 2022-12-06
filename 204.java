import java.util.*;

class wasdawda {

    public static Scanner sc = new Scanner(System.in);

    static void start(){
        int x;
        System.out.println("Input:");
        x= sc.nextInt();
        if((x%5==0) && (x%9 ==0)){
            System.out.print("Yes\n");
        }
        else System.out.print("No\n");
    }
    public static void main(String args[]){
        start();
        start();
        
    }
    
}
