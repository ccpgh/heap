package cc.heap;

public class Runner {

  //private static final int[] _INPUT1 = new int[] { 5, 13, 2, 25, 7, 17, 20, 8, 4 };

  private static final int[] _INPUT2 = new int[] { 5, 13, 2, 25, 7, 17, 20, 8, 4, 13, 2, 25, 7, 17, 20, 8, 4 };
  
  public Runner() {
    
    
  }

  public void run() {
    
    Heap h = new Heap(_INPUT2);

    System.out.println(h.toString());
  }
  
  public static void main(String[] args) {
    
    System.out.println("start.");

    Runner r = new Runner();
    
    r.run();
    
    System.out.println("stop.");
  }
}
