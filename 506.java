class ajwa {
    public static void main(String[] argv) {
       int sum =0;
       int A[][][] = {{{1,2,3},{4,5,6}},
                       {{7,8,9},{10,11,12}},
                       {{13,14,15},{16,17,18}},
                       {{19,20,21},{22,23,24}}};
        for(int a[][]:A){
            for(int b[]:a ){
                for(int c:b){
                    sum+=c;
                }
            }
        }
       System.out.printf("sum = %d\n", sum);
    }
}