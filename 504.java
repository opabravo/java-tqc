import java.util.Scanner;

class addasbn {
    public static Scanner keyboard = new Scanner(System.in);
    
	public static void main(String[] argv) {
        int lst[] = new int[10];
        lst[0] = 0; lst[1] = 1;
        for(int i=2;i<10;i++){
            lst[i] = lst[i-1] + lst[i-2];
        }

        for(int x:lst) System.out.println(x);
    }
}