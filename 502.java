import java.util.Scanner;
class asvb {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n;
        float sum=0, average=0;
        System.out.print("請輸入學生人數:");
        n = sc.nextInt();
        float scores[] = new float[n];
        for(int i=0;i<n;i++){
            System.out.printf("第%d個學生的成績 : ",i+1);
            scores[i] = sc.nextFloat();
        }
        for(float x:scores) sum+=x;
        average = sum/n;

        System.out.print("人數 : "+n);
        System.out.print("總分 : "+sum);
        System.out.print("平均 : "+average);
       
        

    }
}