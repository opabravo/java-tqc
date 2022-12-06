import java.util.*;

class wasdawda {

    public static Scanner sc = new Scanner(System.in);

    static void doCompare(){
        int x,y;
    
        System.out.println("Input:");
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>y){
            System.out.printf("%d is larger than %d\n",x,y);
            return;
        }
        System.out.printf("%d is larger than %d\n",y,x);
    }
    public static void main(String args[]){
        doCompare();
        doCompare();
        
    }
    
}
