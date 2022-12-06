import java.util.Scanner;
class wasdwvvb {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s, c; 
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
    }
    
    static String reverse(String s){
        if(s.equals("")) return s;
        return reverse(s.substring(1))+s.substring(0,1);

    }
}