class oiwa {
    public static void main(String[] argv) {
        int[] data = {2, 4, 3, 5, 7, 6, 9, 1};
        
        int tmp;
        for(int i=0;i<data.length-1;i++){
            for(int j=0;j<data.length-1;j++){
                if(data[j]>data[j+1]){
                    tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
            for(int x:data)System.out.print(x+"\t");
            System.out.print("\n");
        }
    }
}