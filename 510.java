import java.util.Scanner;
class wasdg {
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] argv) {
        search();
        search();
    }
    
    public static void search() {
        int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45};
        System.out.println(bSearch(data, 2));


    }

    static int bSearch(int[] data, int target){
        int left, right, mid;
        left =0; right = data.length-1;
        while(left<=right){
            mid = (left+right) /2;
            if(target==data[mid]) return mid;
            if(target<data[mid]) right=mid-1; else left=mid+1;
        }
        return -1;
    }
}