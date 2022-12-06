import java.util.Scanner;

class wasawwdasw2{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x=0, sum=0;
        do{
            sum+=x;
            System.out.print("請輸入消費金額，或輸入-1結束： ");
            x = sc.nextInt();
            
        }
        while(x!=-1);

        System.out.println("出電腦周邊總消費的總和:"+sum);
        
    }
    
}