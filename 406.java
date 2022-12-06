import java.util.Scanner;
class JPD04 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
      String str;
      int count;
      System.out.print("Input a String: ");
      str = sc.nextLine();
      count = countA(str);
      System.out.printf("%s has %d As\n", str,count);
      
    }
    
    public static int countA(String str) {
        if(str.equals("")) return 0;
        if(str.substring(0,1).equals("A")) return 1 + countA(str.substring(1));
        return countA(str.substring(1));
      }
}