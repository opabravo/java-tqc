import java.util.*;
class awdasdw {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }

    static String scoreCheck(String subject, int score){
        return (score<60)?subject + " Failed\n":"";
    }
    
    static void test() {
        String result="";
        System.out.print("Input Chinese score:");
        result += scoreCheck("Chinese", sc.nextInt());
        System.out.print("Input English score:");
        result += scoreCheck("English", sc.nextInt());
        System.out.print("Input Math score:");
        result += scoreCheck("Math", sc.nextInt());
        result = (result.length()==0)?"All pass\n":result;
        System.out.println(result);
    }
}
