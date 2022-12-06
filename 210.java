import java.util.*;
class wadsaw {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
        test();
    }
  
    public static void test() {
        String x;
        System.out.println("Input a character:");
        x = sc.nextLine();
        switch(x.charAt(0)){
            case 'a':
            case 'b': System.out.println("You entered a or b"); break;
            case 'y': System.out.println("You entered y"); break;
            default: System.out.println("You entered Something else"); break;
        }
    }
}


