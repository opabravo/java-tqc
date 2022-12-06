class aaaa {
  
  public static int add(int x, int y){
    System.out.printf("Adding two integers:%d,%d\n",x,y);
    return x+y;
  }

  public static double add(double x, double y){
    System.out.printf("Adding two integers:%.1f,%.1f\n",x,y);
    return x+y;
  }

  public static String add(String x, String y){
    System.out.printf("Adding two Strings:%s,%s\n",x,y);
    return x+y;
  }
  
  public static void main (String[] args) {
    int i = add(2, 3);
    double d = add(5.2, 4.3);
    String s = add("I love ", "Java!!");
    System.out.printf("%d %f %s %n", i, d, s);
  }
}

