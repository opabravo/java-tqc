import java.util.*;
class JPD02 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
        test();
    }

    public static void test() {
        int score;
        System.out.println("Input");
        score = sc.nextInt();
        if(score>=90)System.out.println("Your grade is A");
        else if(score>=80)System.out.println("Your grade is B");
        else if(score>=70)System.out.println("Your grade is C");
        else if(score>=60)System.out.println("Your grade is D");
        else System.out.println("Your grade is F");
        
    }
}
