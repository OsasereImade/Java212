package javatwotwelve;

  public class Example2 {
     public static void main(String[] args) {
        example1(6,2);
     }
     public static void example1(int a, int b) {
        if (a>b) {
           example1(a-1,b);
           System.out.println("a: "+a+", b: "+b);
  
       }
    }
 }

